@startuml

interface Shape3D{
+calculateVolume(): double 
}

interface Shape2D{
+calculatePerimeter(): double
}

class Rectangle{
+ Rectangle(sideA: double, sideB: double)
+ getSideA(): double
+ getSideB(): double
+ calculatePerimeter(): double
}


class Square{
+ Square(w: double)
+ getSide(): double
+ calculatePerimeter(): double
}

class Sphere{
+ Square(w: double)
+ getRadius(): double
+ calculateVolume(): double
}

Class Square implements Shape2D
Class Rectangle implements Shape2D
Class Sphere implements Shape3D

@enduml