/*
 * generated by Xtext
 */
package rslingo.rslil4privacy.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import rslingo.rslil4privacy.rSLIL4Privacy.Attribute;
import rslingo.rslil4privacy.rSLIL4Privacy.Collection;
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure;
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Import;
import rslingo.rslil4privacy.rSLIL4Privacy.Informative;
import rslingo.rslil4privacy.rSLIL4Privacy.Policy;
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RSLIL4PrivacyPackage;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientSource;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipientTarget;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;
import rslingo.rslil4privacy.services.RSLIL4PrivacyGrammarAccess;

@SuppressWarnings("all")
public class RSLIL4PrivacySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RSLIL4PrivacyGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RSLIL4PrivacyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RSLIL4PrivacyPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.COLLECTION:
				sequence_Collection(context, (Collection) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.DISCLOSURE:
				sequence_Disclosure(context, (Disclosure) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.ENFORCEMENT:
				sequence_Enforcement(context, (Enforcement) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.INFORMATIVE:
				sequence_Informative(context, (Informative) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.PRIVATE_DATA:
				sequence_PrivateData(context, (PrivateData) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.RECIPIENT:
				sequence_Recipient(context, (Recipient) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.RECIPIENT_PART:
				sequence_RecipientPart(context, (RecipientPart) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.REF_ENFORCEMENT:
				sequence_RefEnforcement(context, (RefEnforcement) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.REF_PRIVATE_DATA:
				sequence_RefPrivateData(context, (RefPrivateData) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.REF_RECIPIENT:
				sequence_RefRecipient(context, (RefRecipient) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.REF_RECIPIENT_SOURCE:
				sequence_RefRecipientSource(context, (RefRecipientSource) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.REF_RECIPIENT_TARGET:
				sequence_RefRecipientTarget(context, (RefRecipientTarget) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.REF_SERVICE:
				sequence_RefService(context, (RefService) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.RETENTION:
				sequence_Retention(context, (Retention) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.SERVICE:
				sequence_Service(context, (Service) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.SERVICE_PART:
				sequence_ServicePart(context, (ServicePart) semanticObject); 
				return; 
			case RSLIL4PrivacyPackage.USAGE:
				sequence_Usage(context, (Usage) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING description=STRING)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.ATTRIBUTE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.ATTRIBUTE__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         condition=STRING 
	 *         partCollection=[Collection|ID]? 
	 *         refPrivateData+=RefPrivateData* 
	 *         refService+=RefService* 
	 *         refEnforcement+=RefEnforcement* 
	 *         (modality='Permitted' | modality='Obligation' | modality='Forbidden')
	 *     )
	 */
	protected void sequence_Collection(EObject context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         condition=STRING 
	 *         partDisclosure=[Disclosure|ID]? 
	 *         refRecipient+=RefRecipient* 
	 *         refRecipientSource+=RefRecipientSource* 
	 *         refRecipientTarget+=RefRecipientTarget* 
	 *         refPrivateData+=RefPrivateData* 
	 *         refService+=RefService* 
	 *         refEnforcement+=RefEnforcement* 
	 *         (modality='Permitted' | modality='Obligation' | modality='Forbidden')
	 *     )
	 */
	protected void sequence_Disclosure(EObject context, Disclosure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID enforcementName=STRING description=STRING (type='Action' | type='Algorithm' | type='Config' | type='Process' | type='Tool'))
	 */
	protected void sequence_Enforcement(EObject context, Enforcement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         condition=STRING 
	 *         partInformative=[Informative|ID]? 
	 *         refPrivateData+=RefPrivateData* 
	 *         refService+=RefService* 
	 *         refEnforcement+=RefEnforcement* 
	 *         (modality='Permitted' | modality='Obligation' | modality='Forbidden')
	 *     )
	 */
	protected void sequence_Informative(EObject context, Informative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         importelements+=Import* 
	 *         collection+=Collection* 
	 *         disclosure+=Disclosure* 
	 *         retention+=Retention* 
	 *         usage+=Usage* 
	 *         informative+=Informative* 
	 *         privateData+=PrivateData* 
	 *         recipient+=Recipient* 
	 *         service+=Service* 
	 *         enforcement+=Enforcement*
	 *     )
	 */
	protected void sequence_Policy(EObject context, Policy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING (type='PersonalInformation' | type='UsageInformation') attribute+=Attribute*)
	 */
	protected void sequence_PrivateData(EObject context, PrivateData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     recipientPart=[Recipient|ID]
	 */
	protected void sequence_RecipientPart(EObject context, RecipientPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.RECIPIENT_PART__RECIPIENT_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.RECIPIENT_PART__RECIPIENT_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecipientPartAccess().getRecipientPartRecipientIDTerminalRuleCall_0_0_1(), semanticObject.getRecipientPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         recipientName=STRING 
	 *         description=STRING 
	 *         recipientPart+=RecipientPart* 
	 *         (scope='Internal' | scope='External' | scope='Internal/External') 
	 *         (type='Individual' | type='Organization' | type='Individual/Organization')
	 *     )
	 */
	protected void sequence_Recipient(EObject context, Recipient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     refEnforcement=[Enforcement|ID]
	 */
	protected void sequence_RefEnforcement(EObject context, RefEnforcement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.REF_ENFORCEMENT__REF_ENFORCEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.REF_ENFORCEMENT__REF_ENFORCEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefEnforcementAccess().getRefEnforcementEnforcementIDTerminalRuleCall_0_0_1(), semanticObject.getRefEnforcement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refPrivateData=[PrivateData|ID]
	 */
	protected void sequence_RefPrivateData(EObject context, RefPrivateData semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.REF_PRIVATE_DATA__REF_PRIVATE_DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.REF_PRIVATE_DATA__REF_PRIVATE_DATA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefPrivateDataAccess().getRefPrivateDataPrivateDataIDTerminalRuleCall_0_0_1(), semanticObject.getRefPrivateData());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refRecipientSource=[Recipient|ID]
	 */
	protected void sequence_RefRecipientSource(EObject context, RefRecipientSource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.REF_RECIPIENT_SOURCE__REF_RECIPIENT_SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefRecipientSourceAccess().getRefRecipientSourceRecipientIDTerminalRuleCall_0_0_1(), semanticObject.getRefRecipientSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refRecipientTarget=[Recipient|ID]
	 */
	protected void sequence_RefRecipientTarget(EObject context, RefRecipientTarget semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.REF_RECIPIENT_TARGET__REF_RECIPIENT_TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefRecipientTargetAccess().getRefRecipientTargetRecipientIDTerminalRuleCall_0_0_1(), semanticObject.getRefRecipientTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refRecipient=[Recipient|ID]
	 */
	protected void sequence_RefRecipient(EObject context, RefRecipient semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.REF_RECIPIENT__REF_RECIPIENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.REF_RECIPIENT__REF_RECIPIENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefRecipientAccess().getRefRecipientRecipientIDTerminalRuleCall_0_0_1(), semanticObject.getRefRecipient());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refService=[Service|ID]
	 */
	protected void sequence_RefService(EObject context, RefService semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.REF_SERVICE__REF_SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.REF_SERVICE__REF_SERVICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefServiceAccess().getRefServiceServiceIDTerminalRuleCall_0_0_1(), semanticObject.getRefService());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         condition=STRING 
	 *         partRetention=[Retention|ID]? 
	 *         period=STRING 
	 *         refPrivateData+=RefPrivateData* 
	 *         refService+=RefService* 
	 *         refEnforcement+=RefEnforcement* 
	 *         (modality='Permitted' | modality='Obligation' | modality='Forbidden')
	 *     )
	 */
	protected void sequence_Retention(EObject context, Retention semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     servicePart=[Service|ID]
	 */
	protected void sequence_ServicePart(EObject context, ServicePart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RSLIL4PrivacyPackage.Literals.SERVICE_PART__SERVICE_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RSLIL4PrivacyPackage.Literals.SERVICE_PART__SERVICE_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getServicePartAccess().getServicePartServiceIDTerminalRuleCall_0_0_1(), semanticObject.getServicePart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID serviceName=STRING description=STRING? refPrivateData+=RefPrivateData* servicePart+=ServicePart*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         condition=STRING 
	 *         partUsage=[Usage|ID]? 
	 *         refPrivateData+=RefPrivateData* 
	 *         refService+=RefService* 
	 *         refEnforcement+=RefEnforcement* 
	 *         (modality='Permitted' | modality='Obligation' | modality='Forbidden')
	 *     )
	 */
	protected void sequence_Usage(EObject context, Usage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
