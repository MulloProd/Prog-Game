public final class XY {
    public final int X;
    public final int Y;

    public XY(int x, int y) {
        X = x;
        Y = y;
    }

    public XY ADD(XY vector){
        return new XY(X+vector.X, Y+vector.Y);
    }
}
