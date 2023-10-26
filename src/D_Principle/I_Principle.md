@startuml

interface Shape2D{
+calculateArea(): double
}

class AreaCalc{
+ area(shape: 2DShape): double
}

class VolumeCalc{
+ volume(shape: 3DShape): double
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

class Sphere{
+ Square(w: double)
+ getRadius(): double
+ calculateVolume(): double
}

class Main{
+{static} main(args: String[]): void
}


Main *-- AreaCalc: 1
Main *-- VolumeCalc: 1
Main *-- Square: 1
Main *-- Rectangle: 1
Main *-- Sphere: 1

Class Square implements Shape2D
Class Rectangle implements Shape2D
Class Sphere implements Shape3D

@enduml