package visitor;

class ChildPatient implements patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
