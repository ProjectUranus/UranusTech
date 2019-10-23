package com.projecturanus.uranustech.api.material.element;

import static com.projecturanus.uranustech.api.material.element.ElementTypes.*;

/**
 * Elements exists in real world.
 */
public enum Elements implements Element {
    H("hydrogen", NONMETAL), He("helium", NOBLE_GAS),
    Li("lithium", ALKALI_METAL), Be("beryllium", ALKALI_EARTH_METAL), B("boron", METALLOID), C("carbon", NONMETAL), N("nitrogen", NONMETAL), O("oxygen", NONMETAL), F("fluorine", NONMETAL), Ne("neon", NOBLE_GAS),
    Na("sodium", ALKALI_METAL), Mg("magnesium", ALKALI_EARTH_METAL), Al("aluminium", POST_TRANSITION_METAL), Si("silicon", METALLOID), P("phosphorus", NONMETAL), S("sulfur", NONMETAL), Cl("chlorine", NONMETAL), Ar("argon", NOBLE_GAS),
    K("potassium", ALKALI_METAL), Ca("calcium", ALKALI_EARTH_METAL), Sc("scandium", TRANSITION_METAL), Ti("titanium", TRANSITION_METAL), V("vanadium", TRANSITION_METAL), Cr("chromium", TRANSITION_METAL), Mn("manganese", TRANSITION_METAL), Fe("iron", TRANSITION_METAL), Co("cobalt", TRANSITION_METAL), Ni("nickel", TRANSITION_METAL), Cu("copper", TRANSITION_METAL), Zn("zinc", POST_TRANSITION_METAL), Ga("gallium", POST_TRANSITION_METAL), Ge("germanium", METALLOID), As("arsenic", METALLOID), Se("selenium", NONMETAL), Br("bromine", NONMETAL), Kr("krypton", NOBLE_GAS),
    Rb("rubidium", ALKALI_METAL), Sr("strontium", ALKALI_EARTH_METAL), Y("yttrium", TRANSITION_METAL), Zr("zirconium", TRANSITION_METAL), Nb("niobium", TRANSITION_METAL), Mo("molybdenum", TRANSITION_METAL), Tc("technetium", TRANSITION_METAL), Ru("ruthenium", TRANSITION_METAL), Rh("rhodium", TRANSITION_METAL), Pd("palladium", TRANSITION_METAL), Ag("silver", TRANSITION_METAL), Cd("cadmium", POST_TRANSITION_METAL), In("indium", POST_TRANSITION_METAL), Sn("tin", POST_TRANSITION_METAL), Sb("antimony", METALLOID), Te("tellurium", METALLOID), I("iodine", NONMETAL), Xe("xenon", NOBLE_GAS),
    Cs("caesium", ALKALI_METAL), Ba("barium", ALKALI_EARTH_METAL),
    // La - Lu
    La("lanthanum", LANTHANIDE), Ce("cerium", LANTHANIDE), Pr("praseodymium", LANTHANIDE), Nd("neodymium", LANTHANIDE), Pm("promethium", LANTHANIDE), Sm("samarium", LANTHANIDE), Eu("europium", LANTHANIDE), Gd("gadolinium", LANTHANIDE), Tb("terbium", LANTHANIDE), Dy("dysprosium", LANTHANIDE), Ho("holmium", LANTHANIDE), Er("erbium", LANTHANIDE), Tm("thulium", LANTHANIDE), Yb("ytterbium", LANTHANIDE), Lu("lutetium", LANTHANIDE),

    Hf("hafnium", TRANSITION_METAL), Ta("tantalum", TRANSITION_METAL), W("tungsten", TRANSITION_METAL), Re("rhenium", TRANSITION_METAL), Os("osmium", TRANSITION_METAL), Ir("iridium", TRANSITION_METAL), Pt("platinum", TRANSITION_METAL), Au("gold", TRANSITION_METAL), Hg("mercury", POST_TRANSITION_METAL), Tl("thallium", POST_TRANSITION_METAL), Pb("lead", POST_TRANSITION_METAL), Bi("bismuth", POST_TRANSITION_METAL), Po("polonium", POST_TRANSITION_METAL), At("astatine", METALLOID), Rn("radon", NOBLE_GAS),
    Fr("francium", ALKALI_METAL), Ra("radium", ALKALI_EARTH_METAL),
    // Ac - Lr
    Ac("actinium", ACTINIDE), Th("thorium", ACTINIDE), Pa("protactinium", ACTINIDE), U("uranium", ACTINIDE), Np("neptunium", ACTINIDE), Pu("plutonium", ACTINIDE), Am("americium", ACTINIDE), Cm("curium", ACTINIDE), Bk("berkelium", ACTINIDE), Cf("californium", ACTINIDE), Es("einsteinium", ACTINIDE), Fm("fermium", ACTINIDE), Md("mendelevium", ACTINIDE), No("nobelium", ACTINIDE), Lr("lawrencium", ACTINIDE),

    Rf("rutherfordium", TRANSITION_METAL), Db("dubnium", TRANSITION_METAL), Sg("seaborgium", TRANSITION_METAL), Bh("bohrium", TRANSITION_METAL), Hs("hassium", TRANSITION_METAL), Mt("meitnerium"), Ds("darmstadtium"), Rg("roentgenium"), Cn("copernicium", POST_TRANSITION_METAL), Nh("nihonium"), Fl("flerovium"), Mc("moscovium"), Lv("livermorium"), Ts("tennessine"), Og("oganesson");

    private ElementType elementType;
    private String name;
    private int defaultColor = -1;

    Elements(String name) {
        this.elementType = UNKNOWN;
        this.name = name;
    }

    Elements(String name, ElementType elementType) {
        this.elementType = elementType;
        this.name = name;
    }

    Elements(String name, int defaultColor) {
        this.elementType = UNKNOWN;
        this.name = name;
        this.defaultColor = defaultColor;
    }

    Elements(String name, int defaultColor, ElementType elementType) {
        this.elementType = elementType;
        this.defaultColor = defaultColor;
        this.name = name;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDefaultColor() {
        return defaultColor;
    }
}
