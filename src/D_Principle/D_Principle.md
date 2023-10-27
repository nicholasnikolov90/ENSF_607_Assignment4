@startuml

interface IVolumeCalc {
+volume(): double
}

class VolumeCalc{
-volumeCalc: IVolumeCalc
+ volume(): double
}

class Sphere{
+radius: double
+ Sphere(r: double)
+ getRadius(): double
+ volume(): double
}

VolumeCalc "VolumeCalc" --> "1" IVolumeCalc
Class Sphere implements IVolumeCalc

@enduml