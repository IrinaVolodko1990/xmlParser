package by.volodko.epam.xml_xsd.handler;

import org.xml.sax.ErrorHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class PaperErrorHandler  implements ErrorHandler {
    private static Logger logger = LogManager.getLogger();
    private static final String MESSAGE = "{} : {} - {}";

    @Override
    public void warning(SAXParseException e) throws SAXException {
        logger.warn(MESSAGE, e.getLineNumber(), e.getColumnNumber(), e.getMessage());
        throw new SAXException();
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        logger.error(MESSAGE, e.getLineNumber(), e.getColumnNumber(), e.getMessage());
        throw new SAXException();
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        logger.fatal(MESSAGE, e.getLineNumber(), e.getColumnNumber(), e.getMessage());
        throw new SAXException();
    }

}