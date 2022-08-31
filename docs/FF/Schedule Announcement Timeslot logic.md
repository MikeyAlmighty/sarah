# Schedule Announcement Timeslot logic

- Disabled timeslot (UI)
- Can BE provide timeslot availability? (server time) `isAvailable` bool along with possible list of slots
- Disable timeslot if ends in next 5 mins
- Currently on CC, if I schedule a media and choose today as the date, I can enter slots that have already expired (Past). - At least on the Front end