package gov.iti.jets.exceptions.mappers;

import javax.print.attribute.standard.Media;

import gov.iti.jets.exceptions.NotFoundException;
import gov.iti.jets.exceptions.models.ExceptionError;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
// @Produces(value = {MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException e) {
        ExceptionError errorMessage = new ExceptionError(e.getMessage(), 404, "probably wrong ID ");
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }

}
