package nl.jixxed.eliteodysseymaterials.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@Getter
@RequiredArgsConstructor
public enum Commodity implements HorizonsMaterial {
    ADVANCEDCATALYSERS(CommodityType.TECHNOLOGY, FALSE),
    ADVANCEDMEDICINES(CommodityType.MEDICINES, FALSE),
    ADVERT1(CommodityType.CONSUMER_ITEMS, TRUE),
    AERIALEDENAPPLE(CommodityType.FOODS, TRUE),
    AGANIPPERUSH(CommodityType.MEDICINES, TRUE),
    AGRICULTURALMEDICINES(CommodityType.MEDICINES, FALSE),
    AGRONOMICTREATMENT(CommodityType.CHEMICALS, FALSE),
    AIRELICS(CommodityType.SALVAGE, FALSE),
    ALACARAKMOSKINART(CommodityType.CONSUMER_ITEMS, TRUE),
    ALBINOQUECHUAMAMMOTH(CommodityType.FOODS, TRUE),
    ALEXANDRITE(CommodityType.MINERALS, FALSE),
    ALGAE(CommodityType.FOODS, FALSE),
    ALIENEGGS(CommodityType.CONSUMER_ITEMS, TRUE),
    ALTAIRIANSKIN(CommodityType.CONSUMER_ITEMS, TRUE),
    ALUMINIUM(CommodityType.METALS, FALSE),
    ALYABODILYSOAP(CommodityType.MEDICINES, TRUE),
    ANCIENTCASKET(CommodityType.SALVAGE, FALSE),
    ANCIENTKEY(CommodityType.SALVAGE, FALSE),
    ANCIENTORB(CommodityType.SALVAGE, FALSE),
    ANCIENTRELIC(CommodityType.SALVAGE, FALSE),
    ANCIENTRELICTG(CommodityType.SALVAGE, FALSE),
    ANCIENTTABLET(CommodityType.SALVAGE, FALSE),
    ANCIENTTOTEM(CommodityType.SALVAGE, FALSE),
    ANCIENTURN(CommodityType.SALVAGE, FALSE),
    ANDULIGAFIREWORKS(CommodityType.CONSUMER_ITEMS, TRUE),
    ANIMALEFFIGIES(CommodityType.LEGAL_DRUGS, TRUE),
    ANIMALMEAT(CommodityType.FOODS, FALSE),
    ANIMALMONITORS(CommodityType.TECHNOLOGY, FALSE),
    ANTIMATTERCONTAINMENTUNIT(CommodityType.SALVAGE, FALSE),
    ANTIQUEJEWELLERY(CommodityType.SALVAGE, FALSE),
    ANTIQUITIES(CommodityType.SALVAGE, FALSE),
    ANYNACOFFEE(CommodityType.FOODS, TRUE),
    APAVIETII(CommodityType.LEGAL_DRUGS, TRUE),
    AQUAPONICSYSTEMS(CommodityType.TECHNOLOGY, FALSE),
    AROUCACONVENTUALSWEETS(CommodityType.FOODS, TRUE),
    ARTICULATIONMOTORS(CommodityType.MACHINERY, FALSE),
    ASSAULTPLANS(CommodityType.SALVAGE, FALSE),
    ATMOSPHERICEXTRACTORS(CommodityType.MACHINERY, FALSE),
    AUTOFABRICATORS(CommodityType.TECHNOLOGY, FALSE),
    AZCANCRIFORMULA42(CommodityType.TECHNOLOGY, TRUE),
    BAKEDGREEBLES(CommodityType.FOODS, TRUE),
    BALTAHSINEVACUUMKRILL(CommodityType.FOODS, TRUE),
    BANKIAMPHIBIOUSLEATHER(CommodityType.TEXTILES, TRUE),
    BASICMEDICINES(CommodityType.MEDICINES, FALSE),
    BASICNARCOTICS(CommodityType.LEGAL_DRUGS, FALSE),
    BASTSNAKEGIN(CommodityType.LEGAL_DRUGS, TRUE),
    BATTLEWEAPONS(CommodityType.WEAPONS, FALSE),
    BAUXITE(CommodityType.MINERALS, FALSE),
    BEER(CommodityType.LEGAL_DRUGS, FALSE),
    BELALANSRAYLEATHER(CommodityType.TEXTILES, TRUE),
    BENITOITE(CommodityType.MINERALS, FALSE),
    BERTRANDITE(CommodityType.MINERALS, FALSE),
    BERYLLIUM(CommodityType.METALS, FALSE),
    BIOREDUCINGLICHEN(CommodityType.TECHNOLOGY, FALSE),
    BIOWASTE(CommodityType.WASTE, FALSE),
    BISMUTH(CommodityType.METALS, FALSE),
    BLUEMILK(CommodityType.FOODS, TRUE),
    BOOTLEGLIQUOR(CommodityType.LEGAL_DRUGS, FALSE),
    BORASETANIPATHOGENETICS(CommodityType.WEAPONS, TRUE),
    BROMELLITE(CommodityType.MINERALS, FALSE),
    BUCKYBALLBEERMATS(CommodityType.CONSUMER_ITEMS, TRUE),
    BUILDINGFABRICATORS(CommodityType.MACHINERY, FALSE),
    BURNHAMBILEDISTILLATE(CommodityType.LEGAL_DRUGS, TRUE),
    CD75CATCOFFEE(CommodityType.FOODS, TRUE),
    CENTAURIMEGAGIN(CommodityType.LEGAL_DRUGS, TRUE),
    CERAMICCOMPOSITES(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    CEREMONIALHEIKETEA(CommodityType.FOODS, TRUE),
    CETIAEPYORNISEGG(CommodityType.FOODS, TRUE),
    CETIRABBITS(CommodityType.FOODS, TRUE),
    CHAMELEONCLOTH(CommodityType.TEXTILES, TRUE),
    CHATEAUDEAEGAEON(CommodityType.LEGAL_DRUGS, TRUE),
    CHEMICALWASTE(CommodityType.WASTE, FALSE),
    CHERBONESBLOODCRYSTALS(CommodityType.METALS, TRUE),
    CHIERIDANIMARINEPASTE(CommodityType.FOODS, TRUE),
    CLASSIFIEDEXPERIMENTALEQUIPMENT(CommodityType.TECHNOLOGY, TRUE),
    CLOTHING(CommodityType.CONSUMER_ITEMS, FALSE),
    CMMCOMPOSITE(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    COBALT(CommodityType.METALS, FALSE),
    COFFEE(CommodityType.FOODS, FALSE),
    COLTAN(CommodityType.MINERALS, FALSE),
    COMBATSTABILISERS(CommodityType.MEDICINES, FALSE),
    COMERCIALSAMPLES(CommodityType.SALVAGE, FALSE),
    COMPUTERCOMPONENTS(CommodityType.TECHNOLOGY, FALSE),
    CONDUCTIVEFABRICS(CommodityType.TEXTILES, FALSE),
    CONSUMERTECHNOLOGY(CommodityType.CONSUMER_ITEMS, FALSE),
    COOLINGHOSES(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    COPPER(CommodityType.METALS, FALSE),
    COQUIMSPONGIFORMVICTUALS(CommodityType.FOODS, TRUE),
    CROPHARVESTERS(CommodityType.MACHINERY, FALSE),
    CRYOLITE(CommodityType.MINERALS, FALSE),
    CRYSTALLINESPHERES(CommodityType.SALVAGE, TRUE),
    DAMAGEDESCAPEPOD(CommodityType.SALVAGE, FALSE),
    DAMNACARAPACES(CommodityType.TEXTILES, TRUE),
    DATACORE(CommodityType.SALVAGE, FALSE),
    DELTAPHOENICISPALMS(CommodityType.CHEMICALS, TRUE),
    DEURINGASTRUFFLES(CommodityType.FOODS, TRUE),
    DIAGNOSTICSENSOR(CommodityType.TECHNOLOGY, FALSE),
    DIPLOMATICBAG(CommodityType.SALVAGE, FALSE),
    DISOMACORN(CommodityType.FOODS, TRUE),
    DOMESTICAPPLIANCES(CommodityType.CONSUMER_ITEMS, FALSE),
    DRONES(CommodityType.NONMARKETABLE, FALSE),
    DURADRIVES(CommodityType.CONSUMER_ITEMS, TRUE),
    EARTHRELICS(CommodityType.SALVAGE, FALSE),
    ELEUTHERMALS(CommodityType.CONSUMER_ITEMS, TRUE),
    EMERGENCYPOWERCELLS(CommodityType.MACHINERY, FALSE),
    ENCRIPTEDDATASTORAGE(CommodityType.SALVAGE, FALSE),
    ENCRYPTEDCORRESPONDENCE(CommodityType.SALVAGE, FALSE),
    ERANINPEARLWHISKY(CommodityType.LEGAL_DRUGS, TRUE),
    ESHUUMBRELLAS(CommodityType.CONSUMER_ITEMS, TRUE),
    ESUSEKUCAVIAR(CommodityType.FOODS, TRUE),
    ETHGREZETEABUDS(CommodityType.FOODS, TRUE),
    EVACUATIONSHELTER(CommodityType.CONSUMER_ITEMS, FALSE),
    EXHAUSTMANIFOLD(CommodityType.MACHINERY, FALSE),
    EXPLOSIVES(CommodityType.CHEMICALS, FALSE),
    FISH(CommodityType.FOODS, FALSE),
    FOODCARTRIDGES(CommodityType.FOODS, FALSE),
    FOSSILREMNANTS(CommodityType.SALVAGE, FALSE),
    FRUITANDVEGETABLES(CommodityType.FOODS, FALSE),
    FUJINTEA(CommodityType.FOODS, TRUE),
    GALACTICTRAVELGUIDE(CommodityType.SALVAGE, TRUE),
    GALLITE(CommodityType.MINERALS, FALSE),
    GALLIUM(CommodityType.METALS, FALSE),
    GEAWENDANCEDUST(CommodityType.LEGAL_DRUGS, TRUE),
    GENEBANK(CommodityType.SALVAGE, FALSE),
    GEOLOGICALEQUIPMENT(CommodityType.MACHINERY, FALSE),
    GEOLOGICALSAMPLES(CommodityType.SALVAGE, FALSE),
    GERASIANGUEUZEBEER(CommodityType.LEGAL_DRUGS, TRUE),
    GIANTIRUKAMASNAILS(CommodityType.FOODS, TRUE),
    GIANTVERRIX(CommodityType.MACHINERY, TRUE),
    GILYASIGNATUREWEAPONS(CommodityType.WEAPONS, TRUE),
    GOLD(CommodityType.METALS, FALSE),
    GOMANYAUPONCOFFEE(CommodityType.FOODS, TRUE),
    GOSLARITE(CommodityType.MINERALS, FALSE),
    GRAIN(CommodityType.FOODS, FALSE),
    GRANDIDIERITE(CommodityType.MINERALS, FALSE),
    HAFNIUM178(CommodityType.METALS, FALSE),
    HAIDNEBLACKBREW(CommodityType.FOODS, TRUE),
    HARMASILVERSEARUM(CommodityType.LEGAL_DRUGS, TRUE),
    HAVASUPAIDREAMCATCHER(CommodityType.CONSUMER_ITEMS, TRUE),
    HAZARDOUSENVIRONMENTSUITS(CommodityType.TECHNOLOGY, FALSE),
    HEATSINKINTERLINK(CommodityType.MACHINERY, FALSE),
    HELIOSTATICFURNACES(CommodityType.MACHINERY, FALSE),
    HELVETITJPEARLS(CommodityType.METALS, TRUE),
    HIP10175BUSHMEAT(CommodityType.FOODS, TRUE),
    HIP118311SWARM(CommodityType.WEAPONS, TRUE),
    HIP41181SQUID(CommodityType.FOODS, TRUE),
    HIPORGANOPHOSPHATES(CommodityType.CHEMICALS, TRUE),
    HNSHOCKMOUNT(CommodityType.MACHINERY, FALSE),
    HOLVADUELLINGBLADES(CommodityType.WEAPONS, TRUE),
    HONESTYPILLS(CommodityType.MEDICINES, TRUE),
    HOSTAGE(CommodityType.SALVAGE, FALSE),
    HR7221WHEAT(CommodityType.FOODS, TRUE),
    HYDROGENFUEL(CommodityType.CHEMICALS, FALSE),
    HYDROGENPEROXIDE(CommodityType.CHEMICALS, FALSE),
    IMPERIALSLAVES(CommodityType.SLAVERY, FALSE),
    INDIBOURBON(CommodityType.LEGAL_DRUGS, TRUE),
    INDITE(CommodityType.MINERALS, FALSE),
    INDIUM(CommodityType.METALS, FALSE),
    INSULATINGMEMBRANE(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    IONDISTRIBUTOR(CommodityType.MACHINERY, FALSE),
    JADEITE(CommodityType.MINERALS, FALSE),
    JAQUESQUINENTIANSTILL(CommodityType.CONSUMER_ITEMS, TRUE),
    JARADHARREPUZZLEBOX(CommodityType.CONSUMER_ITEMS, TRUE),
    JAROUARICE(CommodityType.FOODS, TRUE),
    JOTUNMOOKAH(CommodityType.TEXTILES, TRUE),
    KACHIRIGINLEACHES(CommodityType.MEDICINES, TRUE),
    KAMITRACIGARS(CommodityType.LEGAL_DRUGS, TRUE),
    KAMORINHISTORICWEAPONS(CommodityType.WEAPONS, TRUE),
    KARETIICOUTURE(CommodityType.CONSUMER_ITEMS, TRUE),
    KARSUKILOCUSTS(CommodityType.FOODS, TRUE),
    KINAGOINSTRUMENTS(CommodityType.CONSUMER_ITEMS, TRUE),
    KONGGAALE(CommodityType.LEGAL_DRUGS, TRUE),
    KORROKUNGPELLETS(CommodityType.CHEMICALS, TRUE),
    LANDMINES(CommodityType.WEAPONS, FALSE),
    LANTHANUM(CommodityType.METALS, FALSE),
    LARGEEXPLORATIONDATACASH(CommodityType.SALVAGE, FALSE),
    LAVIANBRANDY(CommodityType.LEGAL_DRUGS, TRUE),
    LEATHER(CommodityType.TEXTILES, FALSE),
    LEESTIANEVILJUICE(CommodityType.LEGAL_DRUGS, TRUE),
    LEPIDOLITE(CommodityType.MINERALS, FALSE),
    LFTVOIDEXTRACTCOFFEE(CommodityType.FOODS, TRUE),
    LIQUIDOXYGEN(CommodityType.CHEMICALS, FALSE),
    LIQUOR(CommodityType.LEGAL_DRUGS, FALSE),
    LITHIUM(CommodityType.METALS, FALSE),
    LITHIUMHYDROXIDE(CommodityType.MINERALS, FALSE),
    LIVEHECATESEAWORMS(CommodityType.FOODS, TRUE),
    LOWTEMPERATUREDIAMOND(CommodityType.MINERALS, FALSE),
    LTTHYPERSWEET(CommodityType.FOODS, TRUE),
    LYRAEWEED(CommodityType.LEGAL_DRUGS, TRUE),
    M_TISSUESAMPLE_FLUID(CommodityType.SALVAGE, FALSE),
    M_TISSUESAMPLE_NERVES(CommodityType.SALVAGE, FALSE),
    M_TISSUESAMPLE_SOFT(CommodityType.SALVAGE, FALSE),
    M3_TISSUESAMPLE_MEMBRANE(CommodityType.SALVAGE, FALSE),
    M3_TISSUESAMPLE_MYCELIUM(CommodityType.SALVAGE, FALSE),
    M3_TISSUESAMPLE_SPORES(CommodityType.SALVAGE, FALSE),
    MAGNETICEMITTERCOIL(CommodityType.MACHINERY, FALSE),
    MARINESUPPLIES(CommodityType.MACHINERY, FALSE),
    MASTERCHEFS(CommodityType.SLAVERY, TRUE),
    MECHUCOSHIGHTEA(CommodityType.FOODS, TRUE),
    MEDBSTARLUBE(CommodityType.CHEMICALS, TRUE),
    MEDICALDIAGNOSTICEQUIPMENT(CommodityType.TECHNOLOGY, FALSE),
    METAALLOYS(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    METHANECLATHRATE(CommodityType.MINERALS, FALSE),
    METHANOLMONOHYDRATECRYSTALS(CommodityType.MINERALS, FALSE),
    MICROCONTROLLERS(CommodityType.TECHNOLOGY, FALSE),
    MILITARYGRADEFABRICS(CommodityType.TEXTILES, FALSE),
    MILITARYINTELLIGENCE(CommodityType.SALVAGE, FALSE),
    MINERALEXTRACTORS(CommodityType.MACHINERY, FALSE),
    MINERALOIL(CommodityType.CHEMICALS, FALSE),
    MODULARTERMINALS(CommodityType.MACHINERY, FALSE),
    MOISSANITE(CommodityType.MINERALS, FALSE),
    MOKOJINGBEASTFEAST(CommodityType.FOODS, TRUE),
    MOMUSBOGSPANIEL(CommodityType.CONSUMER_ITEMS, TRUE),
    MONAZITE(CommodityType.MINERALS, FALSE),
    MOTRONAEXPERIENCEJELLY(CommodityType.LEGAL_DRUGS, TRUE),
    MUKUSUBIICHITINOS(CommodityType.FOODS, TRUE),
    MULACHIGIANTFUNGUS(CommodityType.FOODS, TRUE),
    MUSGRAVITE(CommodityType.MINERALS, FALSE),
    MUTOMIMAGER(CommodityType.TECHNOLOGY, FALSE),
    MYSTERIOUSIDOL(CommodityType.SALVAGE, FALSE),
    NANOBREAKERS(CommodityType.TECHNOLOGY, FALSE),
    NANOMEDICINES(CommodityType.MEDICINES, TRUE),
    NATURALFABRICS(CommodityType.TEXTILES, FALSE),
    NEOFABRICINSULATION(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    NERITUSBERRIES(CommodityType.FOODS, TRUE),
    NERVEAGENTS(CommodityType.CHEMICALS, FALSE),
    NGADANDARIFIREOPALS(CommodityType.METALS, TRUE),
    NGUNAMODERNANTIQUES(CommodityType.CONSUMER_ITEMS, TRUE),
    NJANGARISADDLES(CommodityType.CONSUMER_ITEMS, TRUE),
    NONEUCLIDIANEXOTANKS(CommodityType.MACHINERY, TRUE),
    NONLETHALWEAPONS(CommodityType.WEAPONS, FALSE),
    OCCUPIEDCRYOPOD(CommodityType.SALVAGE, FALSE),
    OCHOENGCHILLIES(CommodityType.FOODS, TRUE),
    ONIONHEAD(CommodityType.LEGAL_DRUGS, TRUE),
    ONIONHEADA(CommodityType.LEGAL_DRUGS, TRUE),
    ONIONHEADB(CommodityType.LEGAL_DRUGS, TRUE),
    ONIONHEADC(CommodityType.LEGAL_DRUGS, FALSE),
    OPAL(CommodityType.MINERALS, FALSE),
    OPHIUCHIEXINOARTEFACTS(CommodityType.CONSUMER_ITEMS, TRUE),
    ORRERIANVICIOUSBREW(CommodityType.FOODS, TRUE),
    OSMIUM(CommodityType.METALS, FALSE),
    P_PARTICULATESAMPLE(CommodityType.SALVAGE, FALSE),
    PAINITE(CommodityType.MINERALS, FALSE),
    PALLADIUM(CommodityType.METALS, FALSE),
    PANTAAPRAYERSTICKS(CommodityType.MEDICINES, TRUE),
    PAVONISEARGRUBS(CommodityType.LEGAL_DRUGS, TRUE),
    PERFORMANCEENHANCERS(CommodityType.MEDICINES, FALSE),
    PERSONALEFFECTS(CommodityType.SALVAGE, FALSE),
    PERSONALGIFTS(CommodityType.SALVAGE, TRUE),
    PERSONALWEAPONS(CommodityType.WEAPONS, FALSE),
    PESTICIDES(CommodityType.CHEMICALS, FALSE),
    PLATINUM(CommodityType.METALS, FALSE),
    PLATINUMALOY(CommodityType.METALS, TRUE),
    POLITICALPRISONER(CommodityType.SALVAGE, FALSE),
    POLYMERS(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    POWERCONVERTER(CommodityType.MACHINERY, FALSE),
    POWERGENERATORS(CommodityType.MACHINERY, FALSE),
    POWERGRIDASSEMBLY(CommodityType.MACHINERY, FALSE),
    POWERTRANSFERCONDUITS(CommodityType.MACHINERY, FALSE),
    PRASEODYMIUM(CommodityType.METALS, FALSE),
    PRECIOUSGEMS(CommodityType.SALVAGE, FALSE),
    PROGENITORCELLS(CommodityType.MEDICINES, FALSE),
    PROHIBITEDRESEARCHMATERIALS(CommodityType.SALVAGE, FALSE),
    PYROPHYLLITE(CommodityType.MINERALS, FALSE),
    RADIATIONBAFFLE(CommodityType.MACHINERY, FALSE),
    RAJUKRUSTOVES(CommodityType.CONSUMER_ITEMS, TRUE),
    RAPABAOSNAKESKINS(CommodityType.TEXTILES, TRUE),
    REACTIVEARMOUR(CommodityType.WEAPONS, FALSE),
    REINFORCEDMOUNTINGPLATE(CommodityType.MACHINERY, FALSE),
    RESONATINGSEPARATORS(CommodityType.TECHNOLOGY, FALSE),
    RHODPLUMSITE(CommodityType.MINERALS, FALSE),
    ROBOTICS(CommodityType.TECHNOLOGY, FALSE),
    ROCKFORTHFERTILISER(CommodityType.CHEMICALS, FALSE),
    RUSANIOLDSMOKEY(CommodityType.LEGAL_DRUGS, TRUE),
    RUTILE(CommodityType.MINERALS, FALSE),
    S_TISSUESAMPLE_CELLS(CommodityType.SALVAGE, FALSE),
    S_TISSUESAMPLE_CORE(CommodityType.SALVAGE, FALSE),
    S_TISSUESAMPLE_SURFACE(CommodityType.SALVAGE, FALSE),
    S6_TISSUESAMPLE_CELLS(CommodityType.SALVAGE, FALSE),
    S6_TISSUESAMPLE_COENOSARC(CommodityType.SALVAGE, FALSE),
    S6_TISSUESAMPLE_MESOGLEA(CommodityType.SALVAGE, FALSE),
    S9_TISSUESAMPLE_SHELL(CommodityType.SALVAGE, FALSE),
    SAMARIUM(CommodityType.METALS, FALSE),
    SANUMAMEAT(CommodityType.FOODS, TRUE),
    SAP8CORECONTAINER(CommodityType.SALVAGE, FALSE),
    SAXONWINE(CommodityType.LEGAL_DRUGS, TRUE),
    SCIENTIFICRESEARCH(CommodityType.SALVAGE, FALSE),
    SCIENTIFICSAMPLES(CommodityType.SALVAGE, FALSE),
    SCRAP(CommodityType.WASTE, FALSE),
    SEMICONDUCTORS(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    SERENDIBITE(CommodityType.MINERALS, FALSE),
    SHANSCHARISORCHID(CommodityType.CONSUMER_ITEMS, TRUE),
    SILVER(CommodityType.METALS, FALSE),
    SKIMERCOMPONENTS(CommodityType.MACHINERY, FALSE),
    SLAVES(CommodityType.SLAVERY, FALSE),
    SMALLEXPLORATIONDATACASH(CommodityType.SALVAGE, FALSE),
    SOONTILLRELICS(CommodityType.CONSUMER_ITEMS, TRUE),
    SOTHISCRYSTALLINEGOLD(CommodityType.METALS, TRUE),
    SPACEPIONEERRELICS(CommodityType.SALVAGE, FALSE),
    STRUCTURALREGULATORS(CommodityType.TECHNOLOGY, FALSE),
    SUPERCONDUCTORS(CommodityType.INDUSTRIAL_MATERIALS, FALSE),
    SURFACESTABILISERS(CommodityType.CHEMICALS, FALSE),
    SURVIVALEQUIPMENT(CommodityType.CONSUMER_ITEMS, FALSE),
    SYNTHETICFABRICS(CommodityType.TEXTILES, FALSE),
    SYNTHETICMEAT(CommodityType.FOODS, FALSE),
    SYNTHETICREAGENTS(CommodityType.CHEMICALS, FALSE),
    TAAFFEITE(CommodityType.MINERALS, FALSE),
    TACTICALDATA(CommodityType.SALVAGE, FALSE),
    TANMARKTRANQUILTEA(CommodityType.FOODS, TRUE),
    TANTALUM(CommodityType.METALS, FALSE),
    TARACHTORSPICE(CommodityType.LEGAL_DRUGS, TRUE),
    TAURICHIMES(CommodityType.CONSUMER_ITEMS, TRUE),
    TEA(CommodityType.FOODS, FALSE),
    TELEMETRYSUITE(CommodityType.TECHNOLOGY, FALSE),
    TERRAINENRICHMENTSYSTEMS(CommodityType.TECHNOLOGY, FALSE),
    TERRAMATERBLOODBORES(CommodityType.MEDICINES, TRUE),
    THALLIUM(CommodityType.METALS, FALSE),
    THARGOIDHEART(CommodityType.SALVAGE, FALSE),
    THARGOIDSCOUTTISSUESAMPLE(CommodityType.SALVAGE, FALSE),
    THARGOIDTISSUESAMPLETYPE1(CommodityType.SALVAGE, FALSE),
    THARGOIDTISSUESAMPLETYPE2(CommodityType.SALVAGE, FALSE),
    THARGOIDTISSUESAMPLETYPE3(CommodityType.SALVAGE, FALSE),
    THARGOIDTISSUESAMPLETYPE4(CommodityType.SALVAGE, FALSE),
    THARGOIDTISSUESAMPLETYPE5(CommodityType.SALVAGE, FALSE, GameVersion.LIVE),
    THARGOIDGENERATORTISSUESAMPLE(CommodityType.SALVAGE, FALSE, GameVersion.LIVE),
    THEHUTTONMUG(CommodityType.CONSUMER_ITEMS, TRUE),
    THERMALCOOLINGUNITS(CommodityType.MACHINERY, FALSE),
    THORIUM(CommodityType.METALS, FALSE),
    THRUTISCREAM(CommodityType.LEGAL_DRUGS, TRUE),
    TIEGFRIESSYNTHSILK(CommodityType.TEXTILES, TRUE),
    TIMECAPSULE(CommodityType.SALVAGE, FALSE),
    TIOLCEWASTE2PASTEUNITS(CommodityType.CONSUMER_ITEMS, TRUE),
    TITANIUM(CommodityType.METALS, FALSE),
    TOBACCO(CommodityType.LEGAL_DRUGS, FALSE),
    TOXANDJIVIROCIDE(CommodityType.CHEMICALS, TRUE),
    TOXICWASTE(CommodityType.WASTE, FALSE),
    TRANSGENICONIONHEAD(CommodityType.LEGAL_DRUGS, TRUE),
    TRINKETSOFFORTUNE(CommodityType.CONSUMER_ITEMS, FALSE),
    TRITIUM(CommodityType.CHEMICALS, FALSE),
    UNKNOWNARTIFACT(CommodityType.SALVAGE, FALSE),
    UNKNOWNARTIFACT2(CommodityType.SALVAGE, FALSE),
    UNKNOWNARTIFACT3(CommodityType.SALVAGE, FALSE),
    UNKNOWNBIOLOGICALMATTER(CommodityType.SALVAGE, FALSE),
    UNKNOWNRESIN(CommodityType.SALVAGE, FALSE),
    UNKNOWNTECHNOLOGYSAMPLES(CommodityType.SALVAGE, FALSE),
    UNOCUPPIEDESCAPEPOD(CommodityType.SALVAGE, FALSE, GameVersion.LIVE),
    UNSTABLEDATACORE(CommodityType.SALVAGE, FALSE),
    URANINITE(CommodityType.MINERALS, FALSE),
    URANIUM(CommodityType.METALS, FALSE),
    USSCARGOANCIENTARTEFACT(CommodityType.SALVAGE, FALSE),
    USSCARGOBLACKBOX(CommodityType.SALVAGE, FALSE),
    USSCARGOEXPERIMENTALCHEMICALS(CommodityType.SALVAGE, FALSE),
    USSCARGOMILITARYPLANS(CommodityType.SALVAGE, FALSE),
    USSCARGOPROTOTYPETECH(CommodityType.SALVAGE, FALSE),
    USSCARGORAREARTWORK(CommodityType.SALVAGE, FALSE),
    USSCARGOREBELTRANSMISSIONS(CommodityType.SALVAGE, FALSE),
    USSCARGOTECHNICALBLUEPRINTS(CommodityType.SALVAGE, FALSE),
    USSCARGOTRADEDATA(CommodityType.SALVAGE, FALSE),
    USZAIANTREEGRUB(CommodityType.FOODS, TRUE),
    UTGAROARMILLENIALEGGS(CommodityType.FOODS, TRUE),
    UZUMOKULOWGWINGS(CommodityType.CONSUMER_ITEMS, TRUE),
    VANAYEQUIRHINOFUR(CommodityType.TEXTILES, TRUE),
    VEGASLIMWEED(CommodityType.MEDICINES, TRUE),
    VHERCULISBODYRUB(CommodityType.MEDICINES, TRUE),
    VIDAVANTIANLACE(CommodityType.CONSUMER_ITEMS, TRUE),
    VOLKHABBEEDRONES(CommodityType.MACHINERY, TRUE),
    WATER(CommodityType.CHEMICALS, FALSE),
    WATERPURIFIERS(CommodityType.MACHINERY, FALSE),
    WATERSOFSHINTARA(CommodityType.MEDICINES, TRUE),
    WHEEMETEWHEATCAKES(CommodityType.FOODS, TRUE),
    WINE(CommodityType.LEGAL_DRUGS, FALSE),
    WITCHHAULKOBEBEEF(CommodityType.FOODS, TRUE),
    WOLF1301FESH(CommodityType.LEGAL_DRUGS, TRUE),
    WRECKAGECOMPONENTS(CommodityType.SALVAGE, FALSE),
    WULPAHYPERBORESYSTEMS(CommodityType.MACHINERY, TRUE),
    WUTHIELOKUFROTH(CommodityType.LEGAL_DRUGS, TRUE),
    XIHECOMPANIONS(CommodityType.TECHNOLOGY, TRUE),
    YASOKONDILEAF(CommodityType.LEGAL_DRUGS, TRUE),
    ZEESSZEANTGLUE(CommodityType.CONSUMER_ITEMS, TRUE),
    AISLINGMEDIAMATERIALS(CommodityType.POWERPLAY, FALSE),
    AISLINGMEDIARESOURCES(CommodityType.POWERPLAY, FALSE),
    AISLINGPROMOTIONALMATERIALS(CommodityType.POWERPLAY, FALSE),
    ALLIANCETRADEAGREEMENTS(CommodityType.POWERPLAY, FALSE),
    ALLIANCELEGASLATIVECONTRACTS(CommodityType.POWERPLAY, FALSE),
    ALLIANCELEGASLATIVERECORDS(CommodityType.POWERPLAY, FALSE),
    LAVIGNYCORRUPTIONDOSSIERS(CommodityType.POWERPLAY, FALSE),
    LAVIGNYFIELDSUPPLIES(CommodityType.POWERPLAY, FALSE),
    LAVIGNYGARISONSUPPLIES(CommodityType.POWERPLAY, FALSE),
    RESTRICTEDPACKAGE(CommodityType.POWERPLAY, FALSE),
    LIBERALCAMPAIGNMATERIALS(CommodityType.POWERPLAY, FALSE),
    FEDERALAID(CommodityType.POWERPLAY, FALSE),
    FEDERALTRADECONTRACTS(CommodityType.POWERPLAY, FALSE),
    LOANEDARMS(CommodityType.POWERPLAY, FALSE),
    PATREUSFIELDSUPPLIES(CommodityType.POWERPLAY, FALSE),
    PATREUSGARISONSUPPLIES(CommodityType.POWERPLAY, FALSE),
    RESTRICTEDINTEL(CommodityType.POWERPLAY, FALSE),
    REPUBLICANFIELDSUPPLIES(CommodityType.POWERPLAY, FALSE),
    REPUBLICANGARISONSUPPLIES(CommodityType.POWERPLAY, FALSE),
    SIRIUSFRANCHISEPACKAGE(CommodityType.POWERPLAY, FALSE),
    SIRIUSCOMMERCIALCONTRACTS(CommodityType.POWERPLAY, FALSE),
    SIRIUSINDUSTRIALEQUIPMENT(CommodityType.POWERPLAY, FALSE),
    TORVALCOMMERCIALCONTRACTS(CommodityType.POWERPLAY, FALSE),
    IMPERIALPRISONER(CommodityType.POWERPLAY, FALSE),
    UTOPIANPUBLICITY(CommodityType.POWERPLAY, FALSE),
    UTOPIANFIELDSUPPLIES(CommodityType.POWERPLAY, FALSE),
    UTOPIANDISSIDENT(CommodityType.POWERPLAY, FALSE),
    ILLICITCONSIGNMENT(CommodityType.POWERPLAY, FALSE),
    UNMARKEDWEAPONS(CommodityType.POWERPLAY, FALSE),
    ONIONHEADSAMPLES(CommodityType.POWERPLAY, FALSE),
    COUNTERCULTURESUPPORT(CommodityType.POWERPLAY, FALSE),
    MARKEDSLAVES(CommodityType.POWERPLAY, FALSE),
    TORVALDEEDS(CommodityType.POWERPLAY, FALSE),
    ONIONHEADDERIVATIVES(CommodityType.POWERPLAY, FALSE),
    OUTOFDATEGOODS(CommodityType.POWERPLAY, FALSE),
    UNDERGROUNDSUPPORT(CommodityType.POWERPLAY, FALSE),
    GROMCOUNTERINTELLIGENCE(CommodityType.POWERPLAY, FALSE),
    GROMWARTROPHIES(CommodityType.POWERPLAY, FALSE),
    UNKNOWN(CommodityType.UNKNOWN, FALSE);
    private final CommodityType commodityType;
    private final boolean rareCommodity;
    private final GameVersion gameVersion;

    Commodity(final CommodityType commodityType, final boolean rareCommodity) {
        this.commodityType = commodityType;
        this.rareCommodity = rareCommodity;
        this.gameVersion = GameVersion.LEGACY;
    }

    @Override
    public String getLocalizationKey() {
        return "material.commodity." + this.name().toLowerCase();
    }

    @Override
    public HorizonsMaterialType getMaterialType() {
        return HorizonsMaterialType.COMMODITY;
    }

    public static Commodity forName(final String name) {
        try {
            return Commodity.valueOf(name.toUpperCase());
        } catch (final IllegalArgumentException ex) {
            return Commodity.UNKNOWN;
        }
    }

    @Override
    public boolean isUnknown() {
        return this == Commodity.UNKNOWN;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNKNOWN;
    }

    @Override
    public int getMaxAmount() {
        return 999;
    }

    @Override
    public HorizonsStorageType getStorageType() {
        return HorizonsStorageType.COMMODITY;
    }

    public static Commodity[] materialsForType(final CommodityType commodityType) {
        return Arrays.stream(Commodity.values())
                .filter(commodity -> commodity.getCommodityType().equals(commodityType))
                .toList().toArray(Commodity[]::new);
    }
}
