# Blanket

**Hello, I cry.**

## Specifications

### User

- There is only one user type, Administrator
- There may be multiple administrators

### User Actions

- The administrator can do all of the following:
    - add rooms
    - make new reservations
    - report issues
    - view a dashhboard which shows the following: (this should be the first thing the admin sees after login)
        - list of vacant rooms
        - list of guests who haven't paid
        - list of guests checking out on current day
        - list of guests checking in on current day
    - view list of rooms (color coded)
    - view list of reservations (color coded)
    - view list of issues
    - change reservation(guest) `paid` status
    - change issue `resolve` status (also considered as deleting an issue)
    - delete rooms
    - delete reservations
    - logout

### UI Requirements

- provide UI for each action the administrator can do
- `Rooms` list must be color coded
    - green = occupied
    - default color = vacant
- `Reservations` must include that dates of which the rooms are vacant
- `Reservations` list must be color coded and mut be displayed in order from the closest date to the latest
    - green = room is vacant on those days
    - default color = room is occupied on those days

### Technical Requirements

- Database must be used

## Authors

- Bernados, Renz
- Cuyos, Kasey
- Ubanan, Daniel

