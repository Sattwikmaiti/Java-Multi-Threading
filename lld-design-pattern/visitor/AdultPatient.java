package visitor;

class AdultPatient implements patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

