
class Square(_length: Int, _height: Int) : Shape(_name){


    // gets the length and height
    fun setDimensions(){
        var height = _height;
        var length = _lenght;
    }

    //implemeted the print function from the interface
    fun printDimensions(){
        println(height);
        println(length);
    }

    // overrides the superclass to calculate Squares area
    override fun getArea(){
        var area;
        area = height * length;
        return area;
    }


}
