class Triangle(_s1: Int, _s2: Int, s3: Int) : Shape (_name) {

    // gets the side lengths
    fun getDimensions(){
        var s1 = _s1;
        var s2 = _s2;
        var s3 = _s3;
    }

    //implemeted the print function from the interface
    fun printDimensions(){
        println(s1);
        println(s2);
        println(s3);
    }

    // overrides the superclass to calculate triangles area
    override fun getArea(){
        var area;
        var s = (s1 + s2 + s3) / 2;
        var num = s(s-s1)*(s-s2)*(s-s3);
        area = math.sqrt(num);
        return area;
    }


}