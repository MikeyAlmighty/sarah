# Jobs/Production Ticket/ Schedule Touch base

## Jobs Add

https://fullfacingpty.atlassian.net/browse/ASC-4720 [Done]

VoiceOver artists
- How do voiceover artists link to gap fillers (Or other way round). Should we filter the voiceover artists when jobType=GapFiller
- For which `jobTypes` is a voiceover artist required?
- Remove placeholders (GapValues/Gap Types) from production ticket (preRec)

- Should media card be above the production card? Script optional, but once `media.priority` we select PreRec, script becomes required. (UX wise, you work top-down, but now need to go to previous card again).

## Schedule media
- if MediaType = PreRec (Script gap value set on job add [if priority=PreRec can we hardcode *0* or *0.00*] If the user defines a value it's incorrect as it can be any value, whereas it should be an applicable denomination value.
- GapFiller value should replace value in script (in correct position)?

- If mediaType is PreRec, on the production ticket flow, on AudioFile upload, can we somehow check if the file contains correct gap silence to script gap amount? Maybe like a BE compile media pre-flight/dry-run?
^ Causes: 
```
Request URL: https://api.dev.radioretail.co.za/v2/media/announcements/e2dd5bd1-d943-4bd3-aad6-644ef3b27aff/compile
Request Method: POST
Status Code: 500 Internal Server Error
{
    "status": 500,
    "description": "There was an internal server error.",
    "errors": [
        {
            "message": "Audio quality validation checks failed after compiling special:\n...af5c48-e32d-45ed-8183-051dba0774f7/ddbee712-e99d-41e4-b5da-d4db70b27af8.mp3:\ncan't stat file (dangling symbolic link?)\n for file /temporary/7caf5c48-e32d-45ed-8183-051dba0774f7/ddbee712-e99d-41e4-b5da-d4db70b27af8.mp3"
        }
    ]
}
```

- FE: Schedule Media Flight Times (When selecting Focused/Weekly) on FE we can select slots in the past (i.e. earlier today/Yesterday)

## Production Ticket
- Tag summary modal: (GapFiller) should not show script, but gap value?
- (JobType Music) When tagging tracks and selecting a music profile (Currently [FE] all tracks get assigned  to the chosen music profile).

## Admin Distribution
- FE: Select distribution You can choose between client/account/store on the UI but it always opens client modal regardless of selection.