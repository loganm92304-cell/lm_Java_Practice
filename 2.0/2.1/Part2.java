2. Relevant attributes and behaviours

Doctor
-----------------------------
- drId : int
- name : String
- specialty : String
- availability : boolean

+ Doctor()
+ Doctor(int drId, String name,
         String specialty, boolean availability)

+ getAvailability() : boolean
+ getPaged() : String


Patient
-----------------------------
- ptId : int
- name : String
- ward : String
- illness : String
- condition : String

+ Patient()
+ Patient(int ptId, String name,
          String ward, String illness,
          String condition)

+ getCondition() : String
+ getVitals() : String