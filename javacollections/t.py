
import matplotlib.pyplot as plt
import numpy as np
from sympy import Symbol, solve
def get_bound(x1, x2, limit):
 x_1 = [limit/x1, 0.0]
 x_2 = [0.0, limit/x2]
 return x_1, x_2
a1 = 10; b1 = 5; max_x1 = 50
a2 = 5; b2 = 10; max_x2 = 40
x1_profit = 2
x2_profit = 3
def plot_solution(b1_x1, b1_x2, max_hrs_x1, x1_profit, b2_x1, b2_x2,
max_hrs_x2, x2_profit):
 # Define decision variables.
 s1 = Symbol('x1')
 s2 = Symbol('x2')
 # Get bounds for x1 and x2.
 x1, y1 = get_bound(b1_x1, b1_x2, max_hrs_x1) # points
 x2, y2 = get_bound(b2_x1, b2_x2, max_hrs_x2)
 constraint1 = b1_x1*s1 + b1_x2*s2 - max_hrs_x1
 constraint2 = b2_x1*s1 + b2_x2*s2 - max_hrs_x2
 soln = solve((constraint1, constraint2), dict=True)[0]
 intersect_x = soln[s1]
 intersect_y = soln[s2]
 max_profit_formula = x1_profit*s1 + x2_profit*s2
 max_profit = float(max_profit_formula.subs({'x1': intersect_x, 'x2':
intersect_y}))
   
 
 plt.plot(x1, y1, linestyle=':', marker='o', color='darkgreen')
 plt.annotate(
 constraint1,
 (0, max_hrs_x1),
 textcoords="offset points",
 
 xytext=(10, -5),
 ha='left',
 color='darkgreen'
 )
 plt.plot(x2, y2, linestyle=':', marker='o', color='darkblue')
 # Label with constraint formula.
 plt.annotate(
 constraint2,
 (max_hrs_x2, 0),
 textcoords="offset points",
 xytext=(-70, 10),
 ha='left',
 color='darkblue'
 )
 
  
 plt.plot(0,0, marker='o')
 plt.plot([0, 0], [max_hrs_x1, 0], linestyle=':', color='grey')
 plt.plot([max_hrs_x2, 0], [0, 0], linestyle=':', color='grey')
 # Fill Feasible Region
 plt.fill(
 [50,x2[0] , intersect_x, 0, 0,50],
 [0,0, intersect_y, y1[1],50,50],
 color='red', alpha=0.5
 )
 # Plot point for maximum profit.
 plt.plot(intersect_x, intersect_y, marker='o', color='red')
 plt.plot(x1, y1, linestyle='--', marker='o', color='red', label='3x1 + 2x2 = 36')
 plt.plot(x2, y2, linestyle='--', marker='o', color='green', label='2x1 + 4x2 = 40')
 # Plot labels for maximum profit.
 plt.annotate(f"Optimal: ({intersect_x}, {intersect_y})\nMin Cost:${max_profit:0.2f}",
 (intersect_x, intersect_y),
 textcoords="offset points",
 xytext=(4,4),
 ha='left')
 plt.annotate(
 "Feasible\nRegion",
 (intersect_x, intersect_y),
 textcoords="offset points",
 xytext=(10,30), ha='left'
 )

 # Render plot.

 plt.show()


plot_solution(a1, b1, max_x1, x1_profit, a2, b2, max_x2, x2_profit)

a1 = 3; b1 = 2; max_x1 = 36
a2 = 2; b2 = 4; max_x2 = 40
x1_profit = 30
x2_profit = 40
def plot_solution(b1_x1, b1_x2, max_hrs_x1, x1_profit, b2_x1, b2_x2,
max_hrs_x2, x2_profit):
 # Define decision variables.
 s1 = Symbol('x1')
 s2 = Symbol('x2')
 x1, y1 = get_bound(b1_x1, b1_x2, max_hrs_x1) # points
 x2, y2 = get_bound(b2_x1, b2_x2, max_hrs_x2)
 constraint1 = b1_x1*s1 + b1_x2*s2 - max_hrs_x1
 constraint2 = b2_x1*s1 + b2_x2*s2 - max_hrs_x2
 soln = solve((constraint1, constraint2), dict=True)[0]
 intersect_x = soln[s1]
 intersect_y = soln[s2]
 max_profit_formula = x1_profit*s1 + x2_profit*s2
 max_profit = float(max_profit_formula.subs({'x1': intersect_x, 'x2':
intersect_y}))
 plt.plot(x1, y1, linestyle=':', marker='o', color='darkgreen')
 plt.annotate(
 constraint1,
 (0, max_hrs_x1),
 textcoords="offset points",
 xytext=(10, -5),
 ha='left',
 color='darkgreen'
 )
 plt.plot(x2, y2, linestyle=':', marker='o', color='darkblue')
 plt.annotate(
 constraint2, (max_hrs_x2, 0),
 textcoords="offset points",
 xytext=(-70, 10),
 ha='left',
 color='darkblue'
 )
 plt.plot(0,0, marker='o')
 plt.plot([0, 0], [max_hrs_x1, 0], linestyle=':', color='grey')
 plt.plot([max_hrs_x2, 0], [0, 0], linestyle=':', color='grey')
 plt.fill(
 [0 , 0, intersect_x,x1[0]],
 [0, y2[1],intersect_y,0],
 color='lightgreen', alpha=0.5

)
 plt.plot(intersect_x, intersect_y, marker='o', color='red')

 plt.annotate(f"Optimal: ({intersect_x}, {intersect_y})\nMax Profit:${max_profit:0.2f}",
 (intersect_x, intersect_y),
 textcoords="offset points",
 xytext=(4,4),
 ha='left')
 plt.annotate(
 "Feasible\nRegion",
 (intersect_x, intersect_y),
 textcoords="offset points",
 xytext=(-16,-40), ha='left'
 )
 plt.show()
plot_solution(a1, b1, max_x1, x1_profit, a2, b2, max_x2, x2_profit)