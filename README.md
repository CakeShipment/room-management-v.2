#Blanket

**Hello, I cry.**

##Specifications

###User

- There is only one user type, Administrator

###User Actions

- The administrator can do all of the following:
    - add rooms
    - make new reservations
    - report issues
    - view list of rooms
    - view list of reservations
    - view list of issues
    - change reservation(guest) `paid` status
    - change issue `resolve` status (also considered as deleting an issue)
    - delete rooms
    - delete reservations

###UI Requirements

- provide UI for each action the administrator can do
- `Rooms` list must be color coded
    - green = occupied
    - default color = vacant
- `Reservations` must include that dates of which the rooms are vacant
- `Reservations` list must be color coded and mut be displayed in order from the closest date to the latest
    - green = room is vacant on those days
    - default color = room is occupied on those days

##Authors

- Bernados, Renz
- Cuyos, Kasey
- Ubanan, Daniel

