# lms
its a testing project which contain springboot API's , Screen Design, JPA etc

#Swagger URL
http://localhost:8084/swagger-ui.html

#Call Master API
curl -X GET --header 'Accept: application/json' 'http://localhost:8084/api/course'
or
From Browser : http://localhost:8084/api/course

#Response

[
  {
    "id": 0,
    "name": "Core Java",
    "code": "CJAVA",
    "description": "Core Java Course in Basic Plan",
    "amount": 100
  },
  {
    "id": 1,
    "name": "Advance Java",
    "code": "AJAVA",
    "description": "Advance Java Course in Basic Plan",
    "amount": 200
  },
  {
    "id": 2,
    "name": "Core & Advance Java",
    "code": "CAJAVA",
    "description": "Core & Advance Java Course in Advance Plan",
    "amount": 400
  },
  {
    "id": 3,
    "name": "Core & Advance & Spring Framework course in Premium plan",
    "code": "CASJAVA",
    "description": "Full Course",
    "amount": 1000
  }
]

#Get Course Priced as per country 
#Find course id and country id via master api

For India Price 
curl -X GET --header 'Accept: application/json' 'http://localhost:8084/api/course/0/country/0'
or from Browser : http://localhost:8084/api/course/0/country/0

Output :
{
  "course": {
    "id": 0,
    "name": "Core Java",
    "code": "CJAVA",
    "description": "Core Java Course in Basic Plan",
    "amount": 100
  },
  "country": {
    "id": 0,
    "name": "INDIA",
    "code": "IND",
    "description": "India"
  },
  "tax": [
    {
      "id": 0,
      "name": "Central GST",
      "code": "CGST",
      "description": "Central GST Tax",
      "countryCode": 0,
      "percentage": 9
    },
    {
      "id": 1,
      "name": "State GST",
      "code": "SGST",
      "description": "State GST Tax",
      "countryCode": 0,
      "percentage": 9
    }
  ],
  "charges": [
    "Course Amount : 100",
    "Central GST is 9% : 9",
    "State GST is 9% : 9",
    "Total Taxes : 18",
    "Total Course Charges : 118"
  ]
}


#Get Priced for America

curl -X GET --header 'Accept: application/json' 'http://localhost:8084/api/course/0/country/1'

Output:
{
  "course": {
    "id": 0,
    "name": "Core Java",
    "code": "CJAVA",
    "description": "Core Java Course in Basic Plan",
    "amount": 100
  },
  "country": {
    "id": 1,
    "name": "America",
    "code": "USA",
    "description": "United State Of America"
  },
  "tax": [
    {
      "id": 2,
      "name": "USA TAX",
      "code": "USA",
      "description": "America Taxes",
      "countryCode": 1,
      "percentage": 24
    }
  ],
  "charges": [
    "Course Amount : 100",
    "USA TAX is 24% : 24",
    "Total Taxes : 24",
    "Total Course Charges : 124"
  ]
}

