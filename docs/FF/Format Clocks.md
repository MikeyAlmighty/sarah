# Format Clocks

- Format for timeslot (hourly)
    Secondary process = Setup automated radio station (Gives feel of live radio playing in-store).
    DON'T use for scheduling specific media for an hour.

Aspects on actual clock

- See difference between music, announcements, format Clock elements
- Can have blank segments
- Show Music segment that allows schedules announcement vs Music segment without schedule announcement (Slicing within slice)
- cross-fading (dotted lines)
- Tooltip onHover
- Link element (Sweeper) don't know exact time (Represented with a line).
- Format clock elements within music segment (pink dotted lines).

Can create a specific (Branded) format clock for Scheduling

## Creating of Segments
Default: Blank segment

Music => 1. Default (dedicated time frame not concerned with what music plays, default store playlist), 
         2. Profile (Define what profiles (languages/genre) to specific hour)
         3. Genres (Might not be necessary for MVP, only if we have format clocks on wizard side)

Play Order => 1. In Sequence (Standard Play order, plays music on system within standard order within playlist)
              2. Random (Non repeating media, can't repeat for following format clock)

Play Options =>  1. Enable/Disable cross-fading?
                 2. Allow scheduled announcements within segment? (Uses media scheduler to schedule announcement, will check same hour format clock is scheduled for, Check any available scheduled announcement segments available else available music segments.)
              1. Insert format clock elements (Links/Sweepers) in music segment? (Between tracks that are played)

No cross-fading for announcements/or inserting of music elements for announcements

Format clock element segments (Link/Sweeper/Entertainment/Silence/Imaging/News/Music Bed)
    play order has "specific" option as well (Only for format clock element) i.e. Morning hour format clock (Every morning)

Format clock category => Setup during format clock element job flow

#### Blank segment vs Silence segment

Blank Segment => Revert to whatever the wizard has default scheduled for that duration
Silence Segment => Won't allow any form of Music/Schedules/Format clock elements to overlay it

#### Music segment with Format Clock Elements inserted within
Music Segment => Select music => Play order => Play Options => Select format clock element type => Select format clock category => Format clock element play order => Play duration (How many times within current music segment)