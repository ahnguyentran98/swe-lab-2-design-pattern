package abstract_factory.concrete_product;

import abstract_factory.abstract_class.Button;

public class PixelButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Pixel button");
    }
}
