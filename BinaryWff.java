public class BinaryWff {
    PropVar left;
    PropVar right;
    Operator op = null;

    public BinaryWff(PropVar left, PropVar right) {
        this.left = left;
        this.right = right;
    }
    public void setOp(Operator op) {
        this.op = op;
    }
    public Operator getOp() {
        return op;
    }
    public PropVar getLeft() {
        return left;
    }
    public PropVar getRight() {
        return right;
    }
    public String toString() {
        if (op == null) return "(" + getLeft().toString() + " null " + getRight().toString() + ")";
        return "(" + getLeft().toString() + " " + op.toString() + " " + getRight().toString() + ")";
    }
}
