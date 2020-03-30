package cl.rvillablanca.flying.saucer.service;

import com.lowagie.text.DocumentException;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import org.xhtmlrenderer.pdf.ITextRenderer;

/**
 * Default implementation for Flying Saucer service
 *
 * @author Rodrigo Villablanca
 */
public class DefaultFlyingSaucerService implements FlyingSaucerService {

    @Override
    public PDFResponse toPdf(HTMLInput input) throws FSException {
        if (input == null || input.getValue() == null || input.getValue().isEmpty()) {
            throw new FSException("Invalid html document");
        }

        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(input.getValue());
            renderer.layout();
            renderer.createPDF(os);
            return new PDFResponse(Base64.getEncoder().encodeToString(os.toByteArray()));
        } catch (DocumentException ex) {
            throw new FSException(ex);
        }
    }

}
