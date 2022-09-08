//TODO: refactor same field into enums - the same as backend side
export interface DestinationDto {
  country: string,
  city: string,
  hotelName: string
}

export interface SecurityRulesDto {
  travelRes: string,
  insurance: string
}

export interface AttractionDto {
  description: string,
  ageRestrictions: string,
  photos: Array<string>

}

export interface HotelFacilitiesDto {
  attractions: Array<AttractionDto>
  apartmentFacilities: Array<string
    >
}

export interface TripDto {
  tripStartDate: string,
  tripEndDate: string,
  destination: DestinationDto,
  cost: number,
  currency: string,
  typeofTransport: string,
  securityRules: SecurityRulesDto,
  paymentType: string,
  mealType: string,
  hotelFacilities: HotelFacilitiesDto,
  photos: Array<string> //string[] is the same as Array<string>

}
