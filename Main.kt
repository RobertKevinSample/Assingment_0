fun main() {

    var shapeOne = new Shape;
    var shapeTwo = new Shape;
    var shapeThree = new Shape;
    var shapeFour = new Shape;

    shapeOne = Square(3,3);
    shapeTwo = Circle(4);
    shapeThree = Triangle(2,3,4);
    shapeFour = EquilateralTriangle(4);

    println("Area ${shapeOne.getArea()}, name: ${shapeOne.name}, Dimensions: ${shapeOne.getDimensions()}")
    println("Area ${shapeTwo.getArea()}, name: ${shapeTwo.name}, Dimensions: ${shapeTwo.getDimensions()}")
    println("Area ${shapeThree.getArea()}, name: ${shapeThree.name}, Dimensions: ${shapeThree.getDimensions()}")
    println("Area ${shapeFour.getArea()}, name: ${shapeFour.name}, Dimensions: ${shapeFour.getDimensions()}")



}