package gov.iti.jets.exceptions.mappers;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.exceptions.models.ExceptionError;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException> {

    @Override
    public Response toResponse(ValidationException e) {
        ExceptionError errorMessage = new ExceptionError(e.getMessage(), 500, e.getMessage());
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
    
}
