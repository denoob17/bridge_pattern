import renderer.Renderer;
import renderer.VectorRenderer;
import renderer.RasterRenderer;
import shape.Shape;
import shape.Circle;
import shape.Square;
class Main {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 10);
        circle.draw();

        circle = new Circle(rasterRenderer, 10);
        circle.draw();

        Shape square = new Square(vectorRenderer, 5);
        square.draw();

        square = new Square(rasterRenderer, 5);
        square.draw();
    }
}