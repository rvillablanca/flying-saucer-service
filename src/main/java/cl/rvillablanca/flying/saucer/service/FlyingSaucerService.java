package cl.rvillablanca.flying.saucer.service;

/**
 * Service that converts html text to pdf
 *
 * @author Rodrigo Villablanca
 */
public interface FlyingSaucerService {

    PDFResponse toPdf(HTMLInput input) throws FSException;
}
