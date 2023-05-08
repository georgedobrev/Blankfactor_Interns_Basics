Below, you can see the format in which each command that will be available and example of input and output.
•	AddGym {gymType} {gymName}
•	AddEquipment {equipmentType}
•	InsertEquipment {gymName} {equipmentType}
•	AddAthlete {gymName} {athleteType} {athleteName} {motivation} {numberOfMedals}
•	TrainAthletes {gymName}
•	EquipmentWeight {gymName}
•	Report
•	Exit

Input
AddGym WeightliftingGym QuadsGym
AddGym BoxingGym Gloveworx
AddAthlete Gloveworx Boxer Mike-Bodysnatcher-McCallum Positive 10
AddAthlete Gloveworx Weightlifter Ray-Merciless-Mercer Intrinsic 8
AddGym BoxingGym GothamGym
AddAthlete GothamGym Boxer Rubin-Hurricane-Carter Positive 9
AddAthlete QuadsGym Wrestler TripleH Leadership 7
AddEquipment BoxingGloves
InsertEquipment Gloveworx BoxingGloves
InsertEquipment QuadsGym Kettlebell
AddEquipment Kettlebell
InsertEquipment QuadsGym Kettlebell
TrainAthletes Gloveworx
AddAthlete QuadsGym Weightlifter  Intrinsic 5
AddAthlete QuadsGym Weightlifter Flex-Wheeler  8
AddAthlete QuadsGym Weightlifter Flex-Wheeler Positive -8
Report
Exit
Output
Successfully added WeightliftingGym.
Successfully added BoxingGym.
Successfully added Boxer to Gloveworx.
The gym is not appropriate.
Successfully added BoxingGym.
Successfully added Boxer to GothamGym.
Invalid athlete type.
Successfully added BoxingGloves.
Successfully added BoxingGloves to Gloveworx.
There isn't equipment of type Kettlebell.
Successfully added Kettlebell.
Successfully added Kettlebell to QuadsGym.
Exercise athletes: 1.
Athlete name cannot be null or empty.
The motivation cannot be null or empty.
Athlete's number of medals cannot be below 0.
QuadsGym is a WeightliftingGym:
Athletes: No athletes
Equipment total count: 1
Equipment total weight: 10000.00 grams
Gloveworx is a BoxingGym:
Athletes: Mike-Bodysnatcher-McCallum
Equipment total count: 1
Equipment total weight: 227.00 grams
GothamGym is a BoxingGym:
Athletes: Rubin-Hurricane-Carter
Equipment total count: 0
Equipment total weight: 0.00 grams

Input
AddGym WeightliftingGym QuadsGym
AddEquipment Kettlebell
AddEquipment Kettlebell
InsertEquipment QuadsGym Kettlebell
InsertEquipment QuadsGym Kettlebell
InsertEquipment QuadsGym Kettlebell
AddAthlete QuadsGym Weightlifter Geoffrey-Oduor Intrinsic 8
AddAthlete QuadsGym Weightlifter Franklin-Atete Leadership 3
TrainAthletes QuadsGym
AddAthlete QuadsGym Weightlifter Faris-Touairi Extrinsic 3
EquipmentWeight QuadsGym
TrainAthletes QuadsGym
Report
Exit
Output
Successfully added WeightliftingGym.
Successfully added Kettlebell.
Successfully added Kettlebell.
Successfully added Kettlebell to QuadsGym.
Successfully added Kettlebell to QuadsGym.
There isn't equipment of type Kettlebell.
Successfully added Weightlifter to QuadsGym.
Successfully added Weightlifter to QuadsGym.
Exercise athletes: 2.
Successfully added Weightlifter to QuadsGym.
The total weight of the equipment in the gym QuadsGym is 20000.00 grams.
Exercise athletes: 3.
QuadsGym is a WeightliftingGym:
Athletes: Geoffrey-Oduor, Franklin-Atete, Faris-Touairi
Equipment total count: 2
Equipment total weight: 20000.00 grams
