@startuml

interface IVolumeCalc {
+volume(): double
}

class VolumeCalc{
-volumeCalc: IVolumeCalc
+ volume(): double
}

class Sphere{
+ Square(w: double)
+ getRadius(): double
+ volume(): double
}

VolumeCalc "VolumeCalc" --> "1" IVolumeCalc
Class Sphere implements IVolumeCalc

@enduml