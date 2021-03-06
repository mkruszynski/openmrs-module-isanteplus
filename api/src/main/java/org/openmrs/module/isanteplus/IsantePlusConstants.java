package org.openmrs.module.isanteplus;

/**
 * This file must always be updated every time apps or/and extensions are added
 * or edited to /src/main/webapp/isantepluspatientdashboard_app.json and
 * /src/main/webapp/isantepluspatientdashboard_extension.json
 * 
 * @author k-joseph
 * 
 */
public class IsantePlusConstants {

	public static String VISITFORMHISTORY_EXTENSIONPOINT_ID = "isanteplus.formHistory";

	public static String LABHISTORY_EXTENSIONPOINT_ID = "isanteplus.labHistory";

	public static String FORMHISTORY_EXTENSIONPOINT_ID = "isanteplus.formsHistory";

	public static String GROWTHCHARTS_EXTENSIONPOINT_ID = "isanteplus.growthCharts";

	public static String WEIGHTSGRAPH_EXTENSIONPOINT_ID = "isanteplus.patientDashboard.secondColumnFragments.weightGraph";

	public static String LASTVIRALLOADTEST_EXTENSIONPOINT_ID = "isanteplus.patientDashboard.secondColumnFragments.lastViralLoadTest";

	public static String ISANTEFORMS_EXTENSIONPOINT_ID = "isanteplus.patientDashboard.firstColumnFragments.isantePlusForms";

	public static String DEFAULT_MOSTRECENTVITALS_APP_EXTENSIONPOINT_ID = "coreapps.mostRecentVitals";

	public static String MOSTRECENTVITALS_EXTENSIONPOINT_ID = "isanteplus.patientDashboard.firstColumnFragments.mostRecentVitals";

	/**
	 * Add a name whenever a new iSante form file is added or one existing is
	 * renamed
	 */
	private static String ISANTEPLUS_FORMFILE_NAMES_SEPARATEDBYCOMMAS = "Adherence.xml,AnalyseDeLaboratoire.xml,FicheDeConsultationOBGYN.xml,FicheDePremiereConsultationOBGYN.xml,FicheDeTravailEtDaccouchement.xml,FichePsychosocialeAdulte.xml,FichePsychosocialePediatrique.xml,OrdonnanceMedicale.xml,Ordonnancepediatrique.xml,RapportDarretDuProgrammeSoinsEtTraitementVIHOrSIDA.xml,SaisiePremiereVisiteAdult.xml,SaisiePremiereVisitePediatrique.xml,SoinsDeSantePrimaireConsultationPediatrique.xml,SoinsDeSantePrimairePremiereConsultation.xml,SoinsDeSantePrimairePremiereConsultationPediatrique.xml,SoinsDeSanteSrimaireConsultation.xml,Vaccination.xml,VisiteDeSuivi.xml,VisiteDeSuiviPediatrique.xml";

	public static String[] ISANTEPLUS_FORMFILE_NAMES = ISANTEPLUS_FORMFILE_NAMES_SEPARATEDBYCOMMAS.split(",");

	public static final String DRUGSHISTORY_EXTENSIONPOINT_ID = "isanteplus.drugsHistory";

	public static String BMIGRAPH_EXTENSIONPOINT_ID = "isanteplus.patientDashboard.secondColumnFragments.bmiGraph";
}
