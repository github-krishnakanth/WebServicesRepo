
/**
 * RailReservationServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package in.co.irctc.rail.services;

/**
 * RailReservationServiceMessageReceiverInOut message receiver
 */

public class RailReservationServiceMessageReceiverInOut
		extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			RailReservationServiceSkeletonInterface skel = (RailReservationServiceSkeletonInterface) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils
					.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {

				if ("bookTicket".equals(methodName)) {

					in.co.irctc.rail.types.Ticket ticket7 = null;
					in.co.irctc.rail.types.ReservationIn wrappedParam = (in.co.irctc.rail.types.ReservationIn) fromOM(
							msgContext.getEnvelope().getBody().getFirstElement(),
							in.co.irctc.rail.types.ReservationIn.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					ticket7 =

							skel.bookTicket(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext), ticket7, false,
							new javax.xml.namespace.QName("http://irctc.co.in/rail/services", "bookTicket"));

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (ReservationFailedFaultMessage e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME, "reservationFailedFault");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getFaultMessage() != null) {
				f.setDetail(toOM(e.getFaultMessage(), false));
			}
			throw f;
		}

		catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//

	private static final javax.xml.bind.JAXBContext wsContext;
	static {
		javax.xml.bind.JAXBContext jc;
		jc = null;
		try {
			jc = javax.xml.bind.JAXBContext.newInstance(in.co.irctc.rail.types.ReservationIn.class,
					in.co.irctc.rail.types.Ticket.class, in.co.irctc.rail.types.ReservationFailedFault.class);
		} catch (javax.xml.bind.JAXBException ex) {
			System.err.println("Unable to create JAXBContext: " + ex.getMessage());
			ex.printStackTrace(System.err);
			Runtime.getRuntime().exit(-1);
		} finally {
			wsContext = jc;
		}
	}

	private org.apache.axiom.om.OMElement toOM(in.co.irctc.rail.types.ReservationIn param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

			JaxbRIDataSource source = new JaxbRIDataSource(in.co.irctc.rail.types.ReservationIn.class, param,
					marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
			org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
			return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	private org.apache.axiom.om.OMElement toOM(in.co.irctc.rail.types.ReservationIn param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

			JaxbRIDataSource source = new JaxbRIDataSource(in.co.irctc.rail.types.ReservationIn.class, param,
					marshaller, "http://irctc.co.in/rail/types", "reservationIn");
			org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://irctc.co.in/rail/types",
					null);
			return factory.createOMElement(source, "reservationIn", namespace);
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			in.co.irctc.rail.types.ReservationIn param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
		envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
		return envelope;
	}

	private org.apache.axiom.om.OMElement toOM(in.co.irctc.rail.types.Ticket param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

			JaxbRIDataSource source = new JaxbRIDataSource(in.co.irctc.rail.types.Ticket.class, param, marshaller,
					methodQName.getNamespaceURI(), methodQName.getLocalPart());
			org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
			return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	private org.apache.axiom.om.OMElement toOM(in.co.irctc.rail.types.Ticket param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

			JaxbRIDataSource source = new JaxbRIDataSource(in.co.irctc.rail.types.Ticket.class, param, marshaller,
					"http://irctc.co.in/rail/types", "Ticket");
			org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://irctc.co.in/rail/types",
					null);
			return factory.createOMElement(source, "Ticket", namespace);
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			in.co.irctc.rail.types.Ticket param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
			throws org.apache.axis2.AxisFault {
		org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
		envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
		return envelope;
	}

	private org.apache.axiom.om.OMElement toOM(in.co.irctc.rail.types.ReservationFailedFault param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

			JaxbRIDataSource source = new JaxbRIDataSource(in.co.irctc.rail.types.ReservationFailedFault.class, param,
					marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
			org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
			return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	private org.apache.axiom.om.OMElement toOM(in.co.irctc.rail.types.ReservationFailedFault param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

			org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

			JaxbRIDataSource source = new JaxbRIDataSource(in.co.irctc.rail.types.ReservationFailedFault.class, param,
					marshaller, "http://irctc.co.in/rail/types", "reservationFailedFault");
			org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://irctc.co.in/rail/types",
					null);
			return factory.createOMElement(source, "reservationFailedFault", namespace);
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			in.co.irctc.rail.types.ReservationFailedFault param, boolean optimizeContent,
			javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
		org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
		envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
		return envelope;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
		try {
			javax.xml.bind.JAXBContext context = wsContext;
			javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

			return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(), type).getValue();
		} catch (javax.xml.bind.JAXBException bex) {
			throw org.apache.axis2.AxisFault.makeFault(bex);
		}
	}

	class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
		/**
		 * Bound object for output.
		 */
		private final Object outObject;

		/**
		 * Bound class for output.
		 */
		private final Class outClazz;

		/**
		 * Marshaller.
		 */
		private final javax.xml.bind.Marshaller marshaller;

		/**
		 * Namespace
		 */
		private String nsuri;

		/**
		 * Local name
		 */
		private String name;

		/**
		 * Constructor from object and marshaller.
		 *
		 * @param obj
		 * @param marshaller
		 */
		public JaxbRIDataSource(Class clazz, Object obj, javax.xml.bind.Marshaller marshaller, String nsuri,
				String name) {
			this.outClazz = clazz;
			this.outObject = obj;
			this.marshaller = marshaller;
			this.nsuri = nsuri;
			this.name = name;
		}

		public void serialize(java.io.OutputStream output, org.apache.axiom.om.OMOutputFormat format)
				throws javax.xml.stream.XMLStreamException {
			try {
				marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name),
						outObject.getClass(), outObject), output);
			} catch (javax.xml.bind.JAXBException e) {
				throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
			}
		}

		public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat format)
				throws javax.xml.stream.XMLStreamException {
			try {
				marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name),
						outObject.getClass(), outObject), writer);
			} catch (javax.xml.bind.JAXBException e) {
				throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
			}
		}

		public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			try {
				marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name),
						outObject.getClass(), outObject), xmlWriter);
			} catch (javax.xml.bind.JAXBException e) {
				throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
			}
		}

		public javax.xml.stream.XMLStreamReader getReader() throws javax.xml.stream.XMLStreamException {
			try {
				javax.xml.bind.JAXBContext context = wsContext;
				org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
				javax.xml.bind.Marshaller marshaller = context.createMarshaller();
				marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name),
						outObject.getClass(), outObject), builder);

				return builder.getRootElement().getXMLStreamReader();
			} catch (javax.xml.bind.JAXBException e) {
				throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
			}
		}
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

}// end of class
