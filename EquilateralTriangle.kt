class EquilateralTriangle(_side: Int) : Triangle(_s1,_s2,_s3) {

    // gets the side length
    fun setDimensions(){
        var side = _side;

    //implemeted the print function from the interface
    fun printDimensions(){
        println(side);
    }

    // overrides the superclass to calculate triangles area
    override fun getArea(){
        var area;
        var s = (side*3) /2
        var num = s(s-side)*(s-side)*(s-side);
        area = math.sqrt(num);
        return area;
    }


}