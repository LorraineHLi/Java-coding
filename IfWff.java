public class IfWff extends BinaryWff {
    public IfWff(PropVar left, PropVar right) {
        super(left,right);
        op = Operator.IF;
    }
}
