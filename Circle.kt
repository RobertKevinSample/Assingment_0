class Circle(_radius: Int) : Shape(_name) {

    // gets the radiys
    fun setDimensions(){
        var radius = _radius

    }

    //implemeted the print function from the interface
    fun printDimensions(){
        println(radius);

    }

    // overrides the superclass to calculate circle area
    override fun getArea(){
        var area;
        var pi = 3.14;
        area = pi * (radius * radius)
        return area;
    }

}