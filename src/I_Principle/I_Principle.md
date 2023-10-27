@startuml

interface Shape3D{
+calculateVolume(): double 
}

interface Shape2D{
+calculatePerimeter(): double
}

class Rectangle{
+sideA: double
+sideB: double
+ Rectangle(sideA: double, sideB: double)
+ getSideA(): double
+ getSideB(): double
+ calculatePerimeter(): double
}


class Square{
+side: double
+ Square(w: double)
+ getSide(): double
+ calculatePerimeter(): double
}

class Sphere{
+radius: double
+ Sphere(r: double)
+ getRadius(): double
+ calculateVolume(): double
}

Class Square implements Shape2D
Class Rectangle implements Shape2D
Class Sphere implements Shape3D

@enduml