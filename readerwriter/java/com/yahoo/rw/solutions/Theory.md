
Using join ensures that the main thread does not terminate prematurely. Without join, the main thread could reach the "Completed..." print statement before the user threads have finished their tasks, leading to incomplete or inconsistent results. By waiting for all user threads to finish, the program guarantees that all seat reservations, cancellations, and status checks are done before concluding.








ReadersWriter Interface has been inplemented by 4 solutions : FirstReadersWritersSolution,
SecondReadersWritersSolution,ThirdReadersWritersSolution,ReentrantRWLock .

Readers and Writers are coded.

The Demo is in ManualTest.java

FirstReadersWriterSolution: 

Started Writer Thread : Thread-0 at Fri Jun 28 11:57:20 IST 2024
Started Reader Thread : Thread-1 at Fri Jun 28 11:57:20 IST 2024
Started Writer Thread : Thread-2 at Fri Jun 28 11:57:20 IST 2024
Started Reader Thread : Thread-3 at Fri Jun 28 11:57:20 IST 2024
Started Reader Thread : Thread-4 at Fri Jun 28 11:57:20 IST 2024
Started Reader Thread : Thread-5 at Fri Jun 28 11:57:20 IST 2024
Started Reader Thread : Thread-6 at Fri Jun 28 11:57:20 IST 2024
Started Reader Thread : Thread-7 at Fri Jun 28 11:57:21 IST 2024
Started Writer Thread : Thread-8 at Fri Jun 28 11:57:21 IST 2024
Started Reader Thread : Thread-9 at Fri Jun 28 11:57:21 IST 2024
Started Writer Thread : Thread-10 at Fri Jun 28 11:57:21 IST 2024
Set for Flight-1 time: 100 by Writer Thread: Thread-0 [W]
There are 4 waiting Threads on the write semaphore during writing 
Started Writer Thread : Thread-11 at Fri Jun 28 11:57:21 IST 2024
Started Reader Thread : Thread-12 at Fri Jun 28 11:57:21 IST 2024
Started Reader Thread : Thread-13 at Fri Jun 28 11:57:21 IST 2024
Started Reader Thread : Thread-14 at Fri Jun 28 11:57:21 IST 2024
Schedule for Flight-1 is :100 read by Thread-5 [R]
Schedule for Flight-1 is :100 read by Thread-4[R]
Schedule for Flight-1 is :100 read by Thread-9[R]
Schedule for Flight-1 is :100 read by Thread-1[R]
Schedule for Flight-1 is :100 read by Thread-7[R]
Schedule for Flight-1 is :100 read by Thread-3[R]
Schedule for Flight-1 is :100 read by Thread-6[R]
Schedule for Flight-1 is :100 read by Thread-12[R]
Schedule for Flight-1 is :100 read by Thread-13[R]
Schedule for Flight-1 is :100 read by Thread-14[R]
There are 4 waiting Threads on the write semaphore during reading 
Set for Flight-1 time: 101 by Writer Thread: Thread-2[W]
There are 3 waiting Threads on the write semaphore during writing 
Set for Flight-1 time: 102 by Writer Thread: Thread-8[W]
There are 2 waiting Threads on the write semaphore during writing 
Set for Flight-1 time: 103 by Writer Thread: Thread-10[W]
There are 1 waiting Threads on the write semaphore during writing 
Set for Flight-1 time: 104 by Writer Thread: Thread-11 [W]
Completed...
Map Value: 104