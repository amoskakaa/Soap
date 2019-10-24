//package com.example.demo;
//
//
//
//import localhost.university.GetUniversityRequest;
//import localhost.university.GetUniversityResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ws.server.endpoint.annotation.Endpoint;
//import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
//import org.springframework.ws.server.endpoint.annotation.RequestPayload;
//import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
//
//
//
//
//@Endpoint
//public class UniversityEndpoint {
//    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
//
//
//    private UniversityRepository universityRepository;
//
//
//    @Autowired
//    public UniversityEndpoint(UniversityRepository universityRepository) {
//        this.universityRepository = universityRepository;
//    }
//
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
//    @ResponsePayload
//    public GetUniversityResponse getCountry(@RequestPayload GetUniversityRequest request) {
//        GetUniversityResponse response = new GetUniversityResponse();
//        response.setUniversity(universityRepository.findUniversity(request.getName()));
//
//
//        return response;
//    }
//}
