package visitor;

class SeniorPatient implements patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}