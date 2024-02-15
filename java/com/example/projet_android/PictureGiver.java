package com.example.projet_android;

/**
 * Set pictures of characters and weapons in ListViews
 * @author MARCHAL ESTRADA SAVE
 * @version 1
 */
public class PictureGiver {
    ListCharacter changeCharacter;
    WeaponList changeWeapon;

    public PictureGiver(ListCharacter changeCharacter) {
        this.changeCharacter = changeCharacter;
    }

    public PictureGiver(WeaponList changeWeapon) {
        this.changeWeapon = changeWeapon;
    }

    public ListCharacter SendImageCharacter() {
        for (int i = 0; i < changeCharacter.size(); i++) {
            switch (changeCharacter.get(i).getNom()) {
                case "Albedo":
                    changeCharacter.get(i).imgPerso = R.drawable.albedo;
                    break;
                case "Aloy":
                    changeCharacter.get(i).imgPerso = R.drawable.aloy;
                    break;
                case "Amber":
                    changeCharacter.get(i).imgPerso = R.drawable.amber;
                    break;
                case "Kamisato Ayaka":
                    changeCharacter.get(i).imgPerso = R.drawable.ayaka;
                    break;
                case "Barbara":
                    changeCharacter.get(i).imgPerso = R.drawable.barbara;
                    break;
                case "Beidou":
                    changeCharacter.get(i).imgPerso = R.drawable.beidou;
                    break;
                case "Bennett":
                    changeCharacter.get(i).imgPerso = R.drawable.bennett;
                    break;
                case "Chongyun":
                    changeCharacter.get(i).imgPerso = R.drawable.chongyun;
                    break;
                case "Diluc":
                    changeCharacter.get(i).imgPerso = R.drawable.diluc;
                    break;
                case "Diona":
                    changeCharacter.get(i).imgPerso = R.drawable.diona;
                    break;
                case "Eula":
                    changeCharacter.get(i).imgPerso = R.drawable.eula;
                    break;
                case "Feiyan":
                    changeCharacter.get(i).imgPerso = R.drawable.feiyan;
                    break;
                case "Fischl":
                    changeCharacter.get(i).imgPerso = R.drawable.fischl;
                    break;
                case "Ganyu":
                    changeCharacter.get(i).imgPerso = R.drawable.ganyu;
                    break;
                case "Gorou":
                    changeCharacter.get(i).imgPerso = R.drawable.gorou;
                    break;
                case "Hu Tao":
                    changeCharacter.get(i).imgPerso = R.drawable.hutao;
                    break;
                case "Arataki Itto":
                    changeCharacter.get(i).imgPerso = R.drawable.itto;
                    break;
                case "Jean":
                    changeCharacter.get(i).imgPerso = R.drawable.jean;
                    break;
                case "Kaeya":
                    changeCharacter.get(i).imgPerso = R.drawable.kaeya;
                    break;
                case "Kaedehara Kazuha":
                    changeCharacter.get(i).imgPerso = R.drawable.kazuha;
                    break;
                case "Keqing":
                    changeCharacter.get(i).imgPerso = R.drawable.keqing;
                    break;
                case "Klee":
                    changeCharacter.get(i).imgPerso = R.drawable.klee;
                    break;
                case "Sangonomiya Kokomi":
                    changeCharacter.get(i).imgPerso = R.drawable.kokomi;
                    break;
                case "Lisa":
                    changeCharacter.get(i).imgPerso = R.drawable.lisa;
                    break;
                case "Mona":
                    changeCharacter.get(i).imgPerso = R.drawable.mona;
                    break;
                case "Ningguang":
                    changeCharacter.get(i).imgPerso = R.drawable.ningguang;
                    break;
                case "Noëlle":
                    changeCharacter.get(i).imgPerso = R.drawable.noelle;
                    break;
                case "Qiqi":
                    changeCharacter.get(i).imgPerso = R.drawable.qiqi;
                    break;
                case "Razor":
                    changeCharacter.get(i).imgPerso = R.drawable.razor;
                    break;
                case "Rosalia":
                    changeCharacter.get(i).imgPerso = R.drawable.rosaria;
                    break;
                case "Kujou Sara":
                    changeCharacter.get(i).imgPerso = R.drawable.sara;
                    break;
                case "Sayu":
                    changeCharacter.get(i).imgPerso = R.drawable.sayu;
                    break;
                case "Shenhe":
                    changeCharacter.get(i).imgPerso = R.drawable.shenhe;
                    break;
                case "Shogun Raiden":
                    changeCharacter.get(i).imgPerso = R.drawable.shougun;
                    break;
                case "Sucrose":
                    changeCharacter.get(i).imgPerso = R.drawable.sucrose;
                    break;
                case "Tartaglia":
                    changeCharacter.get(i).imgPerso = R.drawable.tartaglia;
                    break;
                case "Thomas":
                    changeCharacter.get(i).imgPerso = R.drawable.thoma;
                    break;
                case "Venti":
                    changeCharacter.get(i).imgPerso = R.drawable.venti;
                    break;
                case "Xiangling":
                    changeCharacter.get(i).imgPerso = R.drawable.xiangling;
                    break;
                case "Xingqiu":
                    changeCharacter.get(i).imgPerso = R.drawable.xingqiu;
                    break;
                case "Xinyan":
                    changeCharacter.get(i).imgPerso = R.drawable.xinyan;
                    break;
                case "Yaemiko":
                    changeCharacter.get(i).imgPerso = R.drawable.yaemiko;
                    break;
                case "Yoimiya":
                    changeCharacter.get(i).imgPerso = R.drawable.yoimiya;
                    break;
                case "Yunjin":
                    changeCharacter.get(i).imgPerso = R.drawable.yunjin;
                    break;
                case "Zhongli":
                    changeCharacter.get(i).imgPerso = R.drawable.zhongli;
                    break;
                default:
                    changeCharacter.get(i).imgPerso = R.drawable.xiao;
                    break;
            }

        }

        return null;
    }

    public WeaponList SendImageWeapon() {


        for (int j = 0; j < changeWeapon.size(); j++) {

            System.out.println("TESSSSSTTTT");

            switch (changeWeapon.get(j).nom) {
                case "Akuoumaru":
                    changeWeapon.get(j).image = R.drawable.akuoumaru;
                    break;
                case "Traqueur des impasses":
                    changeWeapon.get(j).image = R.drawable.alleyhunter;
                    break;
                case "Lame kageuchi d'Amenoma":
                    changeWeapon.get(j).image = R.drawable.amenomakageuchi;
                    break;
                case "Arc d'Amos":
                    changeWeapon.get(j).image = R.drawable.amosbow;
                    break;
                case "Notes de l'apprenti":
                    changeWeapon.get(j).image = R.drawable.apprenticenotes;
                    break;
                case "Épée du faucon":
                    changeWeapon.get(j).image = R.drawable.aquilafavonia;
                    break;
                case "Lance du débutant":
                    changeWeapon.get(j).image = R.drawable.beginnerprotector;
                    break;
                case "Agate de Rochenoire":
                    changeWeapon.get(j).image = R.drawable.blackcliffagate;
                    break;
                case "Épée longue de Rochenoire":
                    changeWeapon.get(j).image = R.drawable.blackclifflongsword;
                    break;
                case "Lance de Rochenoire":
                    changeWeapon.get(j).image = R.drawable.blackcliffpole;
                    break;
                case "Trancheuse de Rochenoire":
                    changeWeapon.get(j).image = R.drawable.blackcliffslasher;
                    break;
                case "Arc de guerre de Rochenoire":
                    changeWeapon.get(j).image = R.drawable.blackcliffwarbow;
                    break;
                case "Pampille noire":
                    changeWeapon.get(j).image = R.drawable.blacktassel;
                    break;
                case "Épée sanglante":
                    changeWeapon.get(j).image = R.drawable.bloodtaintedgreatsword;
                    break;
                case "Arc à poulies":
                    changeWeapon.get(j).image = R.drawable.compoundbow;
                    break;
                case "Lame froide":
                    changeWeapon.get(j).image = R.drawable.coolsteel;
                    break;
                case "Pique du croissant de lune":
                    changeWeapon.get(j).image = R.drawable.crescentpike;
                    break;
                case "Épée en fer noir":
                    changeWeapon.get(j).image = R.drawable.darkironsword;
                    break;
                case "Scion de la victoire":
                    changeWeapon.get(j).image = R.drawable.deathmatch;
                    break;
                case "Épée de la raison":
                    changeWeapon.get(j).image = R.drawable.debateclub;
                    break;
                case "Contes de Dodoco":
                    changeWeapon.get(j).image = R.drawable.dodocotales;
                    break;
                case "Fléau du dragon":
                    changeWeapon.get(j).image = R.drawable.dragonbane;
                    break;
                case "Lance Dosdragon":
                    changeWeapon.get(j).image = R.drawable.dragonspinespear;
                    break;
                case "Épée émoussée":
                    changeWeapon.get(j).image = R.drawable.dullblade;
                    break;
                case "Ultime soupir":
                    changeWeapon.get(j).image = R.drawable.elegyfortheend;
                    break;
                case "Orbe jadien":
                    changeWeapon.get(j).image = R.drawable.emeraldorb;
                    break;
                case "Lumière du faucheur":
                    changeWeapon.get(j).image = R.drawable.engulfinglightning;
                    break;
                case "Lueur de la lune éternelle":
                    changeWeapon.get(j).image = R.drawable.everlastingmoonglow;
                    break;
                case "Étouffeur de calamités":
                    changeWeapon.get(j).image = R.drawable.calamity;
                    break;
                case "Fuseau de cinabre":
                    changeWeapon.get(j).image = R.drawable.cinnabarspindle;
                    break;
                case "Œil d'assermentation":
                    changeWeapon.get(j).image = R.drawable.eye;
                    break;
                case "Lune de Mouun":
                    changeWeapon.get(j).image = R.drawable.moounmoon;
                    break;
                case "Lance de chasse royale":
                    changeWeapon.get(j).image = R.drawable.royalspear;
                    break;
                case "Œil de la perception":
                    changeWeapon.get(j).image = R.drawable.eyeofperception;
                    break;
                case "Code de Favonius":
                    changeWeapon.get(j).image = R.drawable.favoniuscodex;
                    break;
                case "Espadon de Favonius":
                    changeWeapon.get(j).image = R.drawable.favoniusgreatsword;
                    break;
                case "Lance de Favonius":
                    changeWeapon.get(j).image = R.drawable.favoniuslance;
                    break;
                case "Épée de Favonius":
                    changeWeapon.get(j).image = R.drawable.favoniussword;
                    break;
                case "Arc de chasse de Favonius":
                    changeWeapon.get(j).image = R.drawable.favoniuswarbow;
                    break;
                case "Ombre ferreuse":
                    changeWeapon.get(j).image = R.drawable.ferrousshadow;
                    break;
                case "Croc suppurant":
                    changeWeapon.get(j).image = R.drawable.festeringdesire;
                    break;
                case "Couteau à filets":
                    changeWeapon.get(j).image = R.drawable.filletblade;
                    break;
                case "Serment de la liberté":
                    changeWeapon.get(j).image = R.drawable.freedomsworn;
                    break;
                case "Fruit du permafrost":
                    changeWeapon.get(j).image = R.drawable.frostbearer;
                    break;
                case "Anneau des Hakushin":
                    changeWeapon.get(j).image = R.drawable.hakushinring;
                    break;
                case "Hallebarde":
                    changeWeapon.get(j).image = R.drawable.halberd;
                    break;
                case "Arc d'exorcisme":
                    changeWeapon.get(j).image = R.drawable.hamayumi;
                    break;
                case "Messager de l'Aube":
                    changeWeapon.get(j).image = R.drawable.harbingerofdawn;
                    break;
                case "Arc de chasse":
                    changeWeapon.get(j).image = R.drawable.hunterbow;
                    break;
                case "Pointe de fer":
                    changeWeapon.get(j).image = R.drawable.ironpoint;
                    break;
                case "Piqûre de fer":
                    changeWeapon.get(j).image = R.drawable.ironsting;
                    break;
                case "Espadon de Nagamasa":
                    changeWeapon.get(j).image = R.drawable.katsuragikirinagamasa;
                    break;
                case "Lance en croix de Kitain":
                    changeWeapon.get(j).image = R.drawable.kitaincrossspear;
                    break;
                case "Rugissement du Lion":
                    changeWeapon.get(j).image = R.drawable.lionroar;
                    break;
                case "Épée antique des Millelithes":
                    changeWeapon.get(j).image = R.drawable.lithicblade;
                    break;
                case "lithicspear":  //
                    changeWeapon.get(j).image = R.drawable.lithicspear;
                    break;
                case "L'origine des Quatre Vents":
                    changeWeapon.get(j).image = R.drawable.lostprayertothesacredwinds;
                    break;
                case "Illustre seigneur des mers":
                    changeWeapon.get(j).image = R.drawable.luxurioussealord;
                    break;
                case "Guide de magie":
                    changeWeapon.get(j).image = R.drawable.magicguide;
                    break;
                case "Atlas des terres et des mers":
                    changeWeapon.get(j).image = R.drawable.mappamare;
                    break;
                case "Chaînes mortelles":
                    changeWeapon.get(j).image = R.drawable.memoryofdust;
                    break;
                case "Predator":
                    changeWeapon.get(j).image = R.drawable.predator;
                    break;
                case "Messager":
                    changeWeapon.get(j).image = R.drawable.messenger;
                    break;
                case "Reflet de tranche-brume":
                    changeWeapon.get(j).image = R.drawable.mistsplitterreforged;
                    break;
                case "Valse nocturne":
                    changeWeapon.get(j).image = R.drawable.mitternachtswaltz;
                    break;
                case "Lame du mercenaire":
                    changeWeapon.get(j).image = R.drawable.oldmercpal;
                    break;
                case "Conte d'un autre monde":
                    changeWeapon.get(j).image = R.drawable.otherworldlystory;
                    break;
                case "Grimoire de poche":
                    changeWeapon.get(j).image = R.drawable.pocketgrimoire;
                    break;
                case "Étoile polaire":
                    changeWeapon.get(j).image = R.drawable.polarstar;
                    break;
                case "Coupeur de jade primordial":
                    changeWeapon.get(j).image = R.drawable.primordialjadecutter;
                    break;
                case "Lance de jade ailée":
                    changeWeapon.get(j).image = R.drawable.primordialjadewingedspear;
                    break;
                case "Malice (prototype)":
                    changeWeapon.get(j).image = R.drawable.prototypeamber;
                    break;
                case "Espadon (prototype)":
                    changeWeapon.get(j).image = R.drawable.prototypearchaic;
                    break;
                case "Lune paisible (prototype)":
                    changeWeapon.get(j).image = R.drawable.prototypecrescent;
                    break;
                case "Tailleur de pierre (prototype)":
                    changeWeapon.get(j).image = R.drawable.prototyperancour;
                    break;
                case "Guisarme stellaire (prototype)":
                    changeWeapon.get(j).image = R.drawable.prototypestarglitter;
                    break;
                case "Fluorescence":
                    changeWeapon.get(j).image = R.drawable.rainslasher;
                    break;
                case "Arc du corbeau":
                    changeWeapon.get(j).image = R.drawable.ravenbow;
                    break;
                case "Arc courbé":
                    changeWeapon.get(j).image = R.drawable.recurvebow;
                    break;
                case "Brise-pierre de corne rouge":
                    changeWeapon.get(j).image = R.drawable.redhornstonethresher;
                    break;
                case "Arc royal":
                    changeWeapon.get(j).image = R.drawable.royalbow;
                    break;
                case "Espadon royal":
                    changeWeapon.get(j).image = R.drawable.royalgreatsword;
                    break;
                case "Grimoire royal":
                    changeWeapon.get(j).image = R.drawable.royalgrimoire;
                    break;
                case "Épée longue royale":
                    changeWeapon.get(j).image = R.drawable.royallongsword;
                    break;
                case "Arc rouillé":
                    changeWeapon.get(j).image = R.drawable.rust;
                    break;
                case "Arc rituel":
                    changeWeapon.get(j).image = R.drawable.sacrificialbow;
                    break;
                case "Mémoires de rituels":
                    changeWeapon.get(j).image = R.drawable.sacrificialfragments;
                    break;
                case "Espadon rituel":
                    changeWeapon.get(j).image = R.drawable.sacrificialgreatsword;
                    break;
                case "Épée rituelle":
                    changeWeapon.get(j).image = R.drawable.sacrificialsword;
                    break;
                case "Arc de chasse aguerri":
                    changeWeapon.get(j).image = R.drawable.seasonedhunterbow;
                    break;
                case "Ossature du dragon":
                    changeWeapon.get(j).image = R.drawable.serpentspine;
                    break;
                case "Serment de l'archer":
                    changeWeapon.get(j).image = R.drawable.sharpshooteroath;
                    break;
                case "Épée en argent":
                    changeWeapon.get(j).image = R.drawable.silversword;
                    break;
                case "Grande épée céleste":
                    changeWeapon.get(j).image = R.drawable.skyridergreatsword;
                    break;
                case "Épée céleste":
                    changeWeapon.get(j).image = R.drawable.skyridersword;
                    break;
                case "Atlas de la Voûte d'Azur":
                    changeWeapon.get(j).image = R.drawable.skywardatlas;
                    break;
                case "Lame de la Voûte d'Azur":
                    changeWeapon.get(j).image = R.drawable.skywardblade;
                    break;
                case "Ailes de la Voûte d'Azur":
                    changeWeapon.get(j).image = R.drawable.skywardharp;
                    break;
                case "Fierté de la Voûte d'Azur":
                    changeWeapon.get(j).image = R.drawable.skywardpride;
                    break;
                case "Berge de la Voûte d'Azur":
                    changeWeapon.get(j).image = R.drawable.skywardspine;
                    break;
                case "Lance-pierres":
                    changeWeapon.get(j).image = R.drawable.slingshot;
                    break;
                case "Tombe-neige en argétoile":
                    changeWeapon.get(j).image = R.drawable.snowtombedstarsilver;
                    break;
                case "Perle solaire":
                    changeWeapon.get(j).image = R.drawable.solarpearl;
                    break;
                case "Vérité de Kagura":
                    changeWeapon.get(j).image = R.drawable.kagura;
                    break;
                case "Ode au chant du vent":
                    changeWeapon.get(j).image = R.drawable.songofbrokenpines;
                    break;
                case "soyalspear":  //
                    changeWeapon.get(j).image = R.drawable.soyalspear;
                    break;
                case "Bâton de Homa":
                    changeWeapon.get(j).image = R.drawable.staffofhoma;
                    break;
                case "Tranche-sommets":
                    changeWeapon.get(j).image = R.drawable.summitshaper;
                    break;
                case "Épée de la descente":
                    changeWeapon.get(j).image = R.drawable.swordofdescension;
                    break;
                case "Éclair des impasses":
                    changeWeapon.get(j).image = R.drawable.thealleyflash;
                    break;
                case "Épée-horloge":
                    changeWeapon.get(j).image = R.drawable.thebell;
                    break;
                case "Épée noire":
                    changeWeapon.get(j).image = R.drawable.theblacksword;
                    break;
                case "« La prise »":
                    changeWeapon.get(j).image = R.drawable.thecatch;
                    break;
                case "Flûte":
                    changeWeapon.get(j).image = R.drawable.theflute;
                    break;
                case "Dernière corde":
                    changeWeapon.get(j).image = R.drawable.thestringless;
                    break;
                case "theunforged":  //
                    changeWeapon.get(j).image = R.drawable.theunforged;
                    break;
                case "Arc de chasse verdoyant":
                    changeWeapon.get(j).image = R.drawable.theviridescenthunt;
                    break;
                case "Mouvement vagabond":
                    changeWeapon.get(j).image = R.drawable.thewidsith;
                    break;
                case "Histoire des chasseurs de dragon":
                    changeWeapon.get(j).image = R.drawable.thrillingtalesofdragonslayers;
                    break;
                case "Pulsation du tonnerre":
                    changeWeapon.get(j).image = R.drawable.thunderingpulse;
                    break;
                case "Épée du voyageur":
                    changeWeapon.get(j).image = R.drawable.travelerhandysword;
                    break;
                case "Néphrite jumelle":
                    changeWeapon.get(j).image = R.drawable.twinnephrite;
                    break;
                case "Perceur prismatique":
                    changeWeapon.get(j).image = R.drawable.vortexvanquisher;
                    break;
                case "Épée d'entraînement":
                    changeWeapon.get(j).image = R.drawable.wastergreatsword;
                    break;
                case "Aileron de brise-vagues":
                    changeWeapon.get(j).image = R.drawable.wavebreakerfin;
                    break;
                case "Ombre immaculée":
                    changeWeapon.get(j).image = R.drawable.whiteblind;
                    break;
                case "Grande épée en fer blanc":
                    changeWeapon.get(j).image = R.drawable.whiteirongreatsword;
                    break;
                case "Pampille blanche":
                    changeWeapon.get(j).image = R.drawable.whitetassel;
                    break;
                case "Ode aux alizées":
                    changeWeapon.get(j).image = R.drawable.windblumeode;
                    break;
                case "Vins et chants":
                    changeWeapon.get(j).image = R.drawable.wineandsong;
                    break;
                case "Mort-du-loup":
                    changeWeapon.get(j).image = R.drawable.wolfgravestone;
                    break;
            }

        }
        return this.changeWeapon;
    }
}

