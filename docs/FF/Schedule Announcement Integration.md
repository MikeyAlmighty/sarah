[Mobile Wizard Schedule Announcement](https://fullfacingpty.atlassian.net/browse/ASC-3457)

// TODO:
// If generalAnnouncement is selected filter announcements by: "jobType": "GeneralAnnouncement",
// Otherwise filter by productId

// Special
```json
{
    "description": "Spar Eco Canvas Bag Each Eng",
    "type": "Promo",
    "priority": "Special",
    "prefix": "SP",
    "productId": "32b15448-3093-4a5d-b80c-f524e39f0e60",
    "script": "\"We should all try to save and protect Mother Nature. And you can start by purchasing Spar Eco Canvas Bags, now each for only 10! If we all started using these bags for grocery shopping instead of normal plastic ones, we�ll soon see a difference in the environment! Come on shoppers. Support a good cause. Get your Spar Eco Canvas Bag today, now selling each for only 10!\"",
    "locale": "en-ZA",
    "compilationDetails": {
        "preRecordedBodyId": "5aff6037-de7a-4a4b-b8c8-8075ff9cc907",
        "gapValues": [
            {
                "order": 1,
                "value": "10",
                "type": "MajorDenomination"
            },
            {
                "order": 2,
                "value": "10",
                "type": "MajorDenomination"
            }
        ],
        "gapIds": [
            "666e7a09-0eb2-46aa-8fc8-bebc69fad789",
            "666e7a09-0eb2-46aa-8fc8-bebc69fad789"
        ]
    },
    "tags": [],
    "id": "3f4058b3-f47b-4aa3-89d2-bfd1a5ac09f5"
},
```
// PreRecordedBody
```json
{
    "description": "Rio rice per 2kg pack Eng",
    "type": "Promo",
    "code": "Spar-PB-001163",
    "priority": "PreRecordedBody",
    "productId": "3ff19b93-55be-42f3-8d6f-644f96ec3046",
    "voiceOverId": "2f89f32b-0127-4cdb-9663-f099cd11c64c",
    "script": "\"Treat yourself with the wholesomeness of a quality product, while, at the same time, saving money on your shopping. Get a 2kg pack of Rio Rice from Spar for only R**. Yes, don't settle for anything less. Ask for a 2kg pack of Rio rice from Spar for only R**. That's why shopping is a pleasure at Spar, because Spar is good for you!\"",
    "locale": "en-ZA",
    "tags": [],
    "id": "be214438-a8cb-4a49-9fa7-3df262465911"
},
```
// GeneralAnnouncement
```json
{
    "description": "fef2",
    "priority": "CorporateAnnouncement",
    "expiryDate": "2022-07-31T23:59:59",
    "jobId": "4157cd02-ea79-4f79-a100-a9326d35f829",
    "jobType": "GeneralAnnouncement",
    "jobCode": "JOB-0331",
    "productionCode": "TCKT-0226",
    "script": "*test*",
    "locale": "en-ZA",
    "tags": [],
    "id": "35721069-4259-4acd-ae70-14cc71046f0e"
}
```

Filter gapFillers (v2/media/fillers?type) by type, where type:
- Minor Denomination => PreRecordedCent
- Major Denomination => PreRecordedRandLong
- Major And Minor Denomination => PreRecordedRandShort and PreRecordedValue

```json
[
    {
        "description": "Steve Wood Eng 83 Rand",
        "file": "https://cdn.fullfacing.io/audio/cfaf0a8c-9364-4c6b-875e-f115aea9b5ea.mp3",
        "fileSize": 21280,
        "code": "Spar-PRS-000481",
        "active": true,
        "clientId": "083fb8da-564f-48d6-ba4b-0d29447528f2",
        "accountIds": [],
        "value": "83",
        "type": "PreRecordedRandShort",
        "prefix": "PRS",
        "valid": true,
        "duration": "PT1S",
        "country": "South Africa",
        "format": "MP3",
        "voiceOverId": "49cdf17b-a72e-4df2-b632-355e1ae18d5d",
        "locale": "en-ZA",
        "approved": true,
        "legacy": {},
        "tags": [],
        "deleted": false,
        "createdAt": "2022-02-03T07:26:38",
        "updatedAt": "2022-02-03T07:26:38",
        "id": "c262d2dd-c4e9-464f-b554-6fac7c50b842"
    },
    {
        "description": "Steve Wood Eng 31 Rand",
        "file": "https://cdn.fullfacing.io/audio/e1c4a183-8d10-4a17-b13f-21a216234728.mp3",
        "fileSize": 22116,
        "code": "Spar-PRS-000429",
        "active": true,
        "clientId": "083fb8da-564f-48d6-ba4b-0d29447528f2",
        "accountIds": [],
        "value": "31",
        "type": "PreRecordedRandShort",
        "prefix": "PRS",
        "valid": true,
        "duration": "PT1S",
        "country": "South Africa",
        "format": "MP3",
        "voiceOverId": "49cdf17b-a72e-4df2-b632-355e1ae18d5d",
        "locale": "en-ZA",
        "approved": true,
        "legacy": {},
        "tags": [],
        "deleted": false,
        "createdAt": "2022-02-03T07:26:36",
        "updatedAt": "2022-02-03T07:26:36",
        "id": "0f8da032-b560-493c-9359-b1cf1c263b77"
    },
]
```