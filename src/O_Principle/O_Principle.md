@startuml

interface Shape2D{
+calculateArea(): double
}

class AreaCalc{
+ area(shape: 2DShape): double
}

class Rectangle{

+ Rectangle(sideA: double, sideB: double)
+ getSideA(): double
+ getSideB(): double
+ calculateArea(): double


}


class Square{

+ Square(w: double)
+ getSide(): double
+ calculateArea(): double
}

class Main{
+{static} main(args: String[]): void
}



Main *-- AreaCalc: 1
Main *-- Square: 1
Main *-- Rectangle: 1

Class Square implements Shape2D
Class Rectangle implements Shape2D

@enduml