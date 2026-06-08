1. Identify at least 5 objects/classes (other than Doctor and Patient)

Nurse
-----------------------------
- nurseId : int
- name : String
- department : String

+ Nurse()
+ Nurse(int nurseId, String name, String department)
+ getDrugs() : String
+ getVitals() : String

Drugs
-----------------------------
- drugId : int
- name : String
- type : String
- dose : double
- expiry : Date

+ Drugs()
+ Drugs(int drugId, String name, String type,
        double dose, Date expiry)
+ getCharted() : String
+ getPrepared() : String

Equipment
-----------------------------
- equipId : int
- name : String
- purpose : String
- condition : String

+ Equipment()
+ Equipment(String name, String purpose)
+ getInspected() : Date

Wards
-----------------------------
- wardId : int
- name : String
- capacity : int
- occupancy : int

+ Wards()
+ Wards(int wardId, String name,
        int capacity, int occupancy)

+ getOccupancy() : int
+ getNewPt() : int
+ getEmptyBed() : int

OR
-----------------------------
- orId : int
- schedule : String
- availability : boolean
- clean : boolean

+ OR()
+ OR(int orId, String schedule,
     boolean availability, boolean clean)

+ getSurgeryAppt() : Date
+ getCleaned() : boolean
+ getAvailability() : boolean