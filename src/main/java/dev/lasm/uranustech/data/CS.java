/**
 * Copyright (c) 2023 GregTech-6 Team
 * <p>
 * This file is part of GregTech.
 * <p>
 * GregTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * GregTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with GregTech. If not, see <http://www.gnu.org/licenses/>.
 */

package dev.lasm.uranustech.data;


import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.fluids.FluidStack;

import java.io.File;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Gregorius Techneticies
 * <p>
 * Class containing useful Constants and Lists.
 * <p>
 * Mainly made for use with static imports.
 * I am doing this to have a better Table alike view on my Code, so I can change things faster using the Block Selection Mode of eclipse.
 *
 * For static imports in Eclipse go to "Window > Preferences > Java > Editor > Content Assist > Favorites" to set static importable Constant Classes such as this one as AutoCompleteable.
 */
@SuppressWarnings("unused")
public class CS {
		// unused: A, D, E, G, H, I, J, K, M, N, O, P, Q, R, S, X, Y, Z
	
	/** Because "true" and "false" are too long. Some Programmers might wanna kill me for that, but this looks much better than true and false, and also it is better to have something that is not 4 and 5 Characters long, because of symmetry */
	public static final boolean T = true, F = false;
	
	/** Character Set with all Numbers */
	public static final HashSet<Character> Ch_N = new HashSet<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
	/** Character Set with all lowercased Characters */
	public static final HashSet<Character> Ch_L = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
	/** Character Set with all uppercased Characters */
	public static final HashSet<Character> Ch_U = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));
	
	/** The first 32 Bits */
	@SuppressWarnings("PointlessBitwiseExpression")
    public static final int[] B = {1<<0,1<<1,1<<2,1<<3,1<<4,1<<5,1<<6,1<<7,1<<8,1<<9,1<<10,1<<11,1<<12,1<<13,1<<14,1<<15,1<<16,1<<17,1<<18,1<<19,1<<20,1<<21,1<<22,1<<23,1<<24,1<<25,1<<26,1<<27,1<<28,1<<29,1<<30,1<<31};
	
	/**
	 * Renamed from "MATERIAL_UNIT" to just "U"
	 * <p>
	 * This is worth exactly one normal Item.
	 * This Constant can be divided by many commonly used Numbers such as
	 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20, 21, 22, 24, 25, ... 64, 81, 96, 144 or 1000
	 * without loosing precision and is for that reason used as Unit of Amount.
	 * But it is also small enough to be multiplied with larger Numbers.
	 * <p>
	 * This is used to determine the amount of Material contained inside a prefixed Ore.
	 * For example Nugget = U / 9 as it contains out of 1/9th of an Ingot.
	 */
	public static final long U = 648648000, U2 = U/2, U3 = U/3, U4 = U/4, U5 = U/5, U6 = U/6, U7 = U/7, U8 = U/8, U9 = U/9, U10 = U/10, U11 = U/11, U12 = U/12, U13 = U/13, U14 = U/14, U15 = U/15, U16 = U/16, U17 = U/17, U18 = U/18, U20 = U/20, U24 = U/24, U25 = U/25, U32 = U/32, U36 = U/36, U40 = U/40, U48 = U/48, U50 = U/50, U64 = U/64, U72 = U/72, U80 = U/80, U96 = U/96, U100 = U/100, U128 = U/128, U144 = U/144, U192 = U/192, U200 = U/200, U240 = U/240, U256 = U/256, U288 = U/288, U480 = U/480, U500 = U/500, U512 = U/512, U1000 = U/1000, U1440 = U/1440;
	/** The Double Version of the Material Unit "U" */
	public static final double UD = U;
	
	/**
	 * Renamed from "FLUID_MATERIAL_UNIT" to just "L"
	 * <p>
	 * Fluid per Material Unit (Prime Factors: 3 * 3 * 2 * 2 * 2 * 2)
	 */
	public static final long L = 144;
	
	/** The offset between Celsius and Kelvin. */
	public static final long C = 273; // 273.15 IRL
	
	/** The Default Environment Temperature in Kelvin */
	public static final long DEF_ENV_TEMP = C + 20, DEFAULT_ENVIRONMENT_TEMPERATURE = C + 20; // 293.15 IRL
	
	/** Used Client Side as a placeholder for "is owned by someone other than you" */
	public static final UUID NOT_YOU = new UUID(+1, -1);
	
	/** The Size of an infinite NEI ItemStack */
	public static final byte NEI_INFINITE = 111;
	
	/** The Voltage Tiers. */
	public static final long[]
	VMIN    = { 1, 16,  64,  256, 1024,  4096, 16384,  65536,  262144, 1048576,  4194304, 16777216,  67108864,  268435456, 1073741824L,  4294967296L},
	VREC    = { 8, 32, 128,  512, 2048,  8192, 32768, 131072,  524288, 2097152,  8388608, 33554432, 134217728,  536870912, 2147483648L,  8589934592L},
	VMAX    = {16, 64, 256, 1024, 4096, 16384, 65536, 262144, 1048576, 4194304, 16777216, 67108864, 268435456, 1073741824, 4294967296L, 17179869184L},
	V       = { 8, 32, 128,  512, 2048,  8192, 32768, 131072,  524288, 2097152,  8388608, 33554432, 134217728,  536870912, 2147483648L,  8589934592L};
	
	/** The short Names for the Voltages */
	public static final String[] VN = {"ULV", "LV", "MV", "HV", "EV", "IV", "LuV", "ZPM", "UV", "PUV1", "PUV2", "PUV3", "PUV4", "PUV5", "ΩV", "ΩV"};
	
	/** The long Names for the Voltages */
	public static final String[] VOLTAGE_NAMES = {"Ultra Low Voltage", "Low Voltage", "Medium Voltage", "High Voltage", "Extreme Voltage", "Insane Voltage", "Ludicrous Voltage", "ZPM Voltage", "Ultimate Voltage", "Post Ultimate Voltage 1", "Post Ultimate Voltage 2", "Post Ultimate Voltage 3", "Post Ultimate Voltage 4", "Post Ultimate Voltage 5", "Omega Voltage of Doom", "Omega Voltage of Doom"};
	
	/** The short Names for the USB Sticks */
	public static final String[] OD_USB_STICKS = {"gt:usbstick0", "gt:usbstick1", "gt:usbstick2", "gt:usbstick3", "gt:usbstick4", "gt:usbstick5", "gt:usbstick6", "gt:usbstick7", "gt:usbstick8", "gt:usbstick9"};
	/** The short Names for the USB Cables */
	public static final String[] OD_USB_CABLES = {"gt:usbcable0", "gt:usbcable1", "gt:usbcable2", "gt:usbcable3", "gt:usbcable4", "gt:usbcable5", "gt:usbcable6", "gt:usbcable7", "gt:usbcable8", "gt:usbcable9"};
	/** The short Names for the USB Drives */
	public static final String[] OD_USB_DRIVES = {"gt:usbdrive0", "gt:usbdrive1", "gt:usbdrive2", "gt:usbdrive3", "gt:usbdrive4", "gt:usbdrive5", "gt:usbdrive6", "gt:usbdrive7", "gt:usbdrive8", "gt:usbdrive9"};
	/** The short Names for the Circuits */
	public static final String[] OD_CIRCUITS = {"gt:circuit0", "gt:circuit1", "gt:circuit2", "gt:circuit3", "gt:circuit4", "gt:circuit5", "gt:circuit6", "gt:circuit7", "gt:circuit8", "gt:circuit9"};
	
	/** Subtext Numbers from 0 to 1000. */
	@SuppressWarnings("UnnecessaryUnicodeEscape")
    public static final String[] NUM_SUB = {
	  "\u2080", "\u2081", "\u2082", "\u2083", "\u2084", "\u2085", "\u2086", "\u2087", "\u2088", "\u2089"
	, "\u2081\u2080", "\u2081\u2081", "\u2081\u2082", "\u2081\u2083", "\u2081\u2084", "\u2081\u2085", "\u2081\u2086", "\u2081\u2087", "\u2081\u2088", "\u2081\u2089"
	, "\u2082\u2080", "\u2082\u2081", "\u2082\u2082", "\u2082\u2083", "\u2082\u2084", "\u2082\u2085", "\u2082\u2086", "\u2082\u2087", "\u2082\u2088", "\u2082\u2089"
	, "\u2083\u2080", "\u2083\u2081", "\u2083\u2082", "\u2083\u2083", "\u2083\u2084", "\u2083\u2085", "\u2083\u2086", "\u2083\u2087", "\u2083\u2088", "\u2083\u2089"
	, "\u2084\u2080", "\u2084\u2081", "\u2084\u2082", "\u2084\u2083", "\u2084\u2084", "\u2084\u2085", "\u2084\u2086", "\u2084\u2087", "\u2084\u2088", "\u2084\u2089"
	, "\u2085\u2080", "\u2085\u2081", "\u2085\u2082", "\u2085\u2083", "\u2085\u2084", "\u2085\u2085", "\u2085\u2086", "\u2085\u2087", "\u2085\u2088", "\u2085\u2089"
	, "\u2086\u2080", "\u2086\u2081", "\u2086\u2082", "\u2086\u2083", "\u2086\u2084", "\u2086\u2085", "\u2086\u2086", "\u2086\u2087", "\u2086\u2088", "\u2086\u2089"
	, "\u2087\u2080", "\u2087\u2081", "\u2087\u2082", "\u2087\u2083", "\u2087\u2084", "\u2087\u2085", "\u2087\u2086", "\u2087\u2087", "\u2087\u2088", "\u2087\u2089"
	, "\u2088\u2080", "\u2088\u2081", "\u2088\u2082", "\u2088\u2083", "\u2088\u2084", "\u2088\u2085", "\u2088\u2086", "\u2088\u2087", "\u2088\u2088", "\u2088\u2089"
	, "\u2089\u2080", "\u2089\u2081", "\u2089\u2082", "\u2089\u2083", "\u2089\u2084", "\u2089\u2085", "\u2089\u2086", "\u2089\u2087", "\u2089\u2088", "\u2089\u2089"
	, "\u2081\u2080\u2080", "\u2081\u2080\u2081", "\u2081\u2080\u2082", "\u2081\u2080\u2083", "\u2081\u2080\u2084", "\u2081\u2080\u2085", "\u2081\u2080\u2086", "\u2081\u2080\u2087", "\u2081\u2080\u2088", "\u2081\u2080\u2089"
	, "\u2081\u2081\u2080", "\u2081\u2081\u2081", "\u2081\u2081\u2082", "\u2081\u2081\u2083", "\u2081\u2081\u2084", "\u2081\u2081\u2085", "\u2081\u2081\u2086", "\u2081\u2081\u2087", "\u2081\u2081\u2088", "\u2081\u2081\u2089"
	, "\u2081\u2082\u2080", "\u2081\u2082\u2081", "\u2081\u2082\u2082", "\u2081\u2082\u2083", "\u2081\u2082\u2084", "\u2081\u2082\u2085", "\u2081\u2082\u2086", "\u2081\u2082\u2087", "\u2081\u2082\u2088", "\u2081\u2082\u2089"
	, "\u2081\u2083\u2080", "\u2081\u2083\u2081", "\u2081\u2083\u2082", "\u2081\u2083\u2083", "\u2081\u2083\u2084", "\u2081\u2083\u2085", "\u2081\u2083\u2086", "\u2081\u2083\u2087", "\u2081\u2083\u2088", "\u2081\u2083\u2089"
	, "\u2081\u2084\u2080", "\u2081\u2084\u2081", "\u2081\u2084\u2082", "\u2081\u2084\u2083", "\u2081\u2084\u2084", "\u2081\u2084\u2085", "\u2081\u2084\u2086", "\u2081\u2084\u2087", "\u2081\u2084\u2088", "\u2081\u2084\u2089"
	, "\u2081\u2085\u2080", "\u2081\u2085\u2081", "\u2081\u2085\u2082", "\u2081\u2085\u2083", "\u2081\u2085\u2084", "\u2081\u2085\u2085", "\u2081\u2085\u2086", "\u2081\u2085\u2087", "\u2081\u2085\u2088", "\u2081\u2085\u2089"
	, "\u2081\u2086\u2080", "\u2081\u2086\u2081", "\u2081\u2086\u2082", "\u2081\u2086\u2083", "\u2081\u2086\u2084", "\u2081\u2086\u2085", "\u2081\u2086\u2086", "\u2081\u2086\u2087", "\u2081\u2086\u2088", "\u2081\u2086\u2089"
	, "\u2081\u2087\u2080", "\u2081\u2087\u2081", "\u2081\u2087\u2082", "\u2081\u2087\u2083", "\u2081\u2087\u2084", "\u2081\u2087\u2085", "\u2081\u2087\u2086", "\u2081\u2087\u2087", "\u2081\u2087\u2088", "\u2081\u2087\u2089"
	, "\u2081\u2088\u2080", "\u2081\u2088\u2081", "\u2081\u2088\u2082", "\u2081\u2088\u2083", "\u2081\u2088\u2084", "\u2081\u2088\u2085", "\u2081\u2088\u2086", "\u2081\u2088\u2087", "\u2081\u2088\u2088", "\u2081\u2088\u2089"
	, "\u2081\u2089\u2080", "\u2081\u2089\u2081", "\u2081\u2089\u2082", "\u2081\u2089\u2083", "\u2081\u2089\u2084", "\u2081\u2089\u2085", "\u2081\u2089\u2086", "\u2081\u2089\u2087", "\u2081\u2089\u2088", "\u2081\u2089\u2089"
	, "\u2082\u2080\u2080", "\u2082\u2080\u2081", "\u2082\u2080\u2082", "\u2082\u2080\u2083", "\u2082\u2080\u2084", "\u2082\u2080\u2085", "\u2082\u2080\u2086", "\u2082\u2080\u2087", "\u2082\u2080\u2088", "\u2082\u2080\u2089"
	, "\u2082\u2081\u2080", "\u2082\u2081\u2081", "\u2082\u2081\u2082", "\u2082\u2081\u2083", "\u2082\u2081\u2084", "\u2082\u2081\u2085", "\u2082\u2081\u2086", "\u2082\u2081\u2087", "\u2082\u2081\u2088", "\u2082\u2081\u2089"
	, "\u2082\u2082\u2080", "\u2082\u2082\u2081", "\u2082\u2082\u2082", "\u2082\u2082\u2083", "\u2082\u2082\u2084", "\u2082\u2082\u2085", "\u2082\u2082\u2086", "\u2082\u2082\u2087", "\u2082\u2082\u2088", "\u2082\u2082\u2089"
	, "\u2082\u2083\u2080", "\u2082\u2083\u2081", "\u2082\u2083\u2082", "\u2082\u2083\u2083", "\u2082\u2083\u2084", "\u2082\u2083\u2085", "\u2082\u2083\u2086", "\u2082\u2083\u2087", "\u2082\u2083\u2088", "\u2082\u2083\u2089"
	, "\u2082\u2084\u2080", "\u2082\u2084\u2081", "\u2082\u2084\u2082", "\u2082\u2084\u2083", "\u2082\u2084\u2084", "\u2082\u2084\u2085", "\u2082\u2084\u2086", "\u2082\u2084\u2087", "\u2082\u2084\u2088", "\u2082\u2084\u2089"
	, "\u2082\u2085\u2080", "\u2082\u2085\u2081", "\u2082\u2085\u2082", "\u2082\u2085\u2083", "\u2082\u2085\u2084", "\u2082\u2085\u2085", "\u2082\u2085\u2086", "\u2082\u2085\u2087", "\u2082\u2085\u2088", "\u2082\u2085\u2089"
	, "\u2082\u2086\u2080", "\u2082\u2086\u2081", "\u2082\u2086\u2082", "\u2082\u2086\u2083", "\u2082\u2086\u2084", "\u2082\u2086\u2085", "\u2082\u2086\u2086", "\u2082\u2086\u2087", "\u2082\u2086\u2088", "\u2082\u2086\u2089"
	, "\u2082\u2087\u2080", "\u2082\u2087\u2081", "\u2082\u2087\u2082", "\u2082\u2087\u2083", "\u2082\u2087\u2084", "\u2082\u2087\u2085", "\u2082\u2087\u2086", "\u2082\u2087\u2087", "\u2082\u2087\u2088", "\u2082\u2087\u2089"
	, "\u2082\u2088\u2080", "\u2082\u2088\u2081", "\u2082\u2088\u2082", "\u2082\u2088\u2083", "\u2082\u2088\u2084", "\u2082\u2088\u2085", "\u2082\u2088\u2086", "\u2082\u2088\u2087", "\u2082\u2088\u2088", "\u2082\u2088\u2089"
	, "\u2082\u2089\u2080", "\u2082\u2089\u2081", "\u2082\u2089\u2082", "\u2082\u2089\u2083", "\u2082\u2089\u2084", "\u2082\u2089\u2085", "\u2082\u2089\u2086", "\u2082\u2089\u2087", "\u2082\u2089\u2088", "\u2082\u2089\u2089"
	, "\u2083\u2080\u2080\u208A"
	};
	
	/** The value of how many Voltz/Mekanism Joules are worth an EU. */
	public static final int  J_PER_EU = 10;
	/** The value of how many RF are worth an MJ. */
	public static final int RF_PER_MJ = 10;
	/** The value of how many RF are worth an EU. */
	public static final int RF_PER_EU =  4;
	/** The value of how many Fuel Ticks a Furnace Smelt has. */
	public static int TICKS_PER_SMELT = 200;
	/** The value of how many Energy Units are worth a Furnace Tick in regards of Fuel -> Energy */
	public static int EU_PER_FURNACE_TICK = 25;
	/** The value of how many Energy Units are worth a Smelt Operation in regards of Energy -> Smelt, because many Mods including IC2 have cheaper smelting. In GT, I go for a Max Efficiency of 19.53125 times that value, so 256 GU per Furnace Operation. */
	public static int EU_PER_SMELT = 256;
	/** The value of how many Energy Units a Liter of Lava is worth. It is worth about 180 to 333 RF in TE. Well, I go for 320 RF in GT, meaning 80 GU/L or 80000 GU per Bucket. Cannot be above 200 GU/L or else MFR exploit with infinite Lava! */
	public static int EU_PER_LAVA = 80;
	/** The value of how many Energy Units a Liter of Hot Coolant also known as "Heatant" is worth. It is worth 20 EU in IC2 Experimental, so it's the same 20 GU in GT6. */
	public static int EU_PER_COOLANT = 20;
	/** The value of how many Energy Units a Liter of Semiheavy Water needs to turn into Hot Semiheavy Water. */
	public static int EU_PER_SEMI_HEAVY_WATER = 40;
	/** The value of how many Energy Units a Liter of Heavy Water needs to turn into Hot Heavy Water. */
	public static int EU_PER_HEAVY_WATER = 50;
	/** The value of how many Energy Units a Liter of Heavy Water needs to turn into Hot Tritiated Water. */
	public static int EU_PER_TRITIATED_WATER = 60;
	/** The value of how many Energy Units a Liter of Molten Sodium needs to turn into Hot Molten Sodium. */
	public static int EU_PER_SODIUM = 30;
	/** The value of how many Energy Units a Liter of Molten Tin needs to turn into Hot Molten Tin. */
	public static int EU_PER_TIN = 40;
	/** The value of how many Energy Units a Liter of Carbon Dioxide needs to turn into Hot Carbon Dioxide. */
	public static int EU_PER_CO2 = 20;
	/** The value of how many Energy Units a Liter of Helium needs to turn into Hot Helium. */
	public static int EU_PER_HELIUM = 30;
	/** The value of how many Energy Units a Liter of Lithium Chloride needs to turn into Hot Helium. */
	public static int EU_PER_LICL = 15;
	/** The value of how many Energy Units a Liter of Molten Thorium Salt needs to turn into Molten Salt. */
	public static int EU_PER_THORIUM_SALT = 2560000;
	/** The value of how many Energy Units a Liter of Water needs to turn into Steam. */
	public static int EU_PER_WATER = 80;
	/** The value of how much Steam an Energy Unit is worth. The Standard is 2 Steam = 1 EU. */
	public static int STEAM_PER_EU = 2;
	/** The value of how much Steam a Liter of Water is worth. The Standard is 160 Steam = 1 Water. */
	public static int STEAM_PER_WATER = 160;

	/** A few Default Values for Light Opacity. */
	public static final int LIGHT_OPACITY_NONE = 0, LIGHT_OPACITY_LEAVES = 1, LIGHT_OPACITY_WATER = 3, LIGHT_OPACITY_MAX = 255;

	/** a Random generator so I don't need to instantiate a new one all the time. */
	public static final Random RNGSUS = new Random(), RANDOM = RNGSUS;
	
	/** Current Time on the Server, since the last Reboot. */
	public static long SERVER_TIME = 0;
	/** Synchronizes all Server to Client Updates to be at the same time. */
	public static boolean SYNC_SECOND = T;
	/** Current Time on the Client. Used for Animations. */
	public static long CLIENT_TIME = 0;
	/** Is locked updateEntities and similar are running on the tick. */
	public static final ReentrantLock TICK_LOCK = new ReentrantLock();

	/** The Colour White as RGB Short Array. */
	public static final short[] UNCOLOURED = {255, 255, 255, 255};
	/** The Colour White as simple Integer (0x00ffffff). */
	public static final int UNCOLORED = 16777215;
	public static final int ALL_NON_ALPHA_COLOR = 0x00ffffff;
	
	public static final int[] RAINBOW_ARRAY = {
		0xff0000,
		0xff4000,
		0xff8000,
		0xffc000,
		0xffff00,
		0xc0ff00,
		0x80ff00,
		0x40ff00,
		0x00ff00,
		0x00ff40,
		0x00ff80,
		0x00ffc0,
		0x00ffff,
		0x00c0ff,
		0x0080ff,
		0x0040ff,
		0x0000ff,
		0x4000ff,
		0x8000ff,
		0xc000ff,
		0xff00ff,
		0xff00c0,
		0xff0080,
		0xff0040,
	};
	
	/** Some Colour Arrays */
	public static final short[]
	  CA_WHITE              = {255, 255, 255, 255}
	, CA_GRAY_192           = {192, 192, 192, 255}
	, CA_GRAY_128           = {128, 128, 128, 255}
	, CA_GRAY_64            = { 64,  64,  64, 255}
	, CA_GRAY_32            = { 32,  32,  32, 255}
	, CA_RED_255            = {255,   0,   0, 255}
	, CA_RED_192            = {192,   0,   0, 255}
	, CA_RED_128            = {128,   0,   0, 255}
	, CA_RED_64             = { 64,   0,   0, 255}
	, CA_RED_32             = { 32,   0,   0, 255}
	, CA_GREEN_255          = {  0, 255,   0, 255}
	, CA_GREEN_192          = {  0, 192,   0, 255}
	, CA_GREEN_128          = {  0, 128,   0, 255}
	, CA_GREEN_64           = {  0,  64,   0, 255}
	, CA_GREEN_32           = {  0,  32,   0, 255}
	, CA_CYAN_255           = {  0, 255, 255, 255}
	, CA_CYAN_192           = {  0, 192, 192, 255}
	, CA_CYAN_128           = {  0, 128, 128, 255}
	, CA_CYAN_64            = {  0,  64,  64, 255}
	, CA_CYAN_32            = {  0,  32,  32, 255}
	, CA_BLUE_255           = {  0,   0, 255, 255}
	, CA_BLUE_192           = {  0,   0, 192, 255}
	, CA_BLUE_128           = {  0,   0, 128, 255}
	, CA_BLUE_64            = {  0,   0,  64, 255}
	, CA_BLUE_32            = {  0,   0,  32, 255}
	, CA_LIGHT_BLUE_255     = {128, 128, 255, 255}
	, CA_LIGHT_BLUE_192     = { 96,  96, 192, 255}
	, CA_LIGHT_BLUE_128     = { 64,  64, 128, 255}
	, CA_LIGHT_BLUE_64      = { 32,  32,  64, 255}
	, CA_LIGHT_BLUE_32      = { 16,  16,  32, 255}
	, CA_YELLOW_255         = {255, 255,   0, 255}
	, CA_YELLOW_192         = {192, 192,   0, 255}
	, CA_YELLOW_128         = {128, 128,   0, 255}
	, CA_YELLOW_64          = { 64,  64,   0, 255}
	, CA_YELLOW_32          = { 32,  32,   0, 255}
	, CA_LIGHT_YELLOW_255   = {255, 255, 128, 255}
	, CA_LIGHT_YELLOW_192   = {192, 192,  96, 255}
	, CA_LIGHT_YELLOW_128   = {128, 128,  64, 255}
	, CA_LIGHT_YELLOW_64    = { 64,  64,  32, 255}
	, CA_LIGHT_YELLOW_32    = { 32,  32,  16, 255}
	;
	
	public static final short[]
	  DYE_None              = {255, 255, 255, 255}
	, DYE_Black             = { 32,  32,  32, 255}
	, DYE_Red               = {255,   0,   0, 255}
	, DYE_Green             = {  0, 255,   0, 255}
	, DYE_Brown             = { 96,  64,   0, 255}
	, DYE_Blue              = {  0,   0, 255, 255}
	, DYE_Purple            = {128,   0, 128, 255}
	, DYE_Cyan              = {  0, 255, 255, 255}
	, DYE_LightGray         = {192, 192, 192, 255}
	, DYE_Gray              = {128, 128, 128, 255}
	, DYE_Pink              = {255, 192, 192, 255}
	, DYE_Lime              = {128, 255, 128, 255}
	, DYE_Yellow            = {255, 255,   0, 255}
	, DYE_LightBlue         = {128, 128, 255, 255}
	, DYE_Magenta           = {255,   0, 255, 255}
	, DYE_Orange            = {255, 128,   0, 255}
	, DYE_White             = {255, 255, 255, 255}
	;
	
	public static final byte
	DYE_INDEX_Black         =  0,
	DYE_INDEX_Red           =  1,
	DYE_INDEX_Green         =  2,
	DYE_INDEX_Brown         =  3,
	DYE_INDEX_Blue          =  4,
	DYE_INDEX_Purple        =  5,
	DYE_INDEX_Cyan          =  6,
	DYE_INDEX_LightGray     =  7,
	DYE_INDEX_Gray          =  8,
	DYE_INDEX_Pink          =  9,
	DYE_INDEX_Lime          = 10,
	DYE_INDEX_Yellow        = 11,
	DYE_INDEX_LightBlue     = 12,
	DYE_INDEX_Magenta       = 13,
	DYE_INDEX_Orange        = 14,
	DYE_INDEX_White         = 15;
	
	public static final String[] DYE_NAMES                  = {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "Light Gray", "Gray", "Pink", "Lime", "Yellow", "Light Blue", "Magenta", "Orange", "White"};
	public static final String[] DYE_OREDICTS               = {"dyeBlack", "dyeRed", "dyeGreen", "dyeBrown", "dyeBlue", "dyePurple", "dyeCyan", "dyeLightGray", "dyeGray", "dyePink", "dyeLime", "dyeYellow", "dyeLightBlue", "dyeMagenta", "dyeOrange", "dyeWhite"};
	public static final String[] DYE_OREDICTS_CERAMIC       = {"dyeCeramicBlack", "dyeCeramicRed", "dyeCeramicGreen", "dyeCeramicBrown", "dyeCeramicBlue", "dyeCeramicPurple", "dyeCeramicCyan", "dyeCeramicLightGray", "dyeCeramicGray", "dyeCeramicPink", "dyeCeramicLime", "dyeCeramicYellow", "dyeCeramicLightBlue", "dyeCeramicMagenta", "dyeCeramicOrange", "dyeCeramicWhite"};
	public static final String[] DYE_OREDICTS_MIXABLE       = {"dyeMixableBlack", "dyeMixableRed", "dyeMixableGreen", "dyeMixableBrown", "dyeMixableBlue", "dyeMixablePurple", "dyeMixableCyan", "dyeMixableLightGray", "dyeMixableGray", "dyeMixablePink", "dyeMixableLime", "dyeMixableYellow", "dyeMixableLightBlue", "dyeMixableMagenta", "dyeMixableOrange", "dyeMixableWhite"};
	public static final String[] DYE_OREDICTS_LENS          = {"craftingLensBlack", "craftingLensRed", "craftingLensGreen", "craftingLensBrown", "craftingLensBlue", "craftingLensPurple", "craftingLensCyan", "craftingLensLightGray", "craftingLensGray", "craftingLensPink", "craftingLensLime", "craftingLensYellow", "craftingLensLightBlue", "craftingLensMagenta", "craftingLensOrange", "craftingLensWhite"};
	public static final String[] DYE_OREDICTS_POST          = {"Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGray", "Gray", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White"};
	public static final String[] HEXORIUM_MONOLITHS         = {"blockEnergizedHexoriumMonolithBlack", "blockEnergizedHexoriumMonolithRed", "blockEnergizedHexoriumMonolithGreen", "blockEnergizedHexoriumMonolithDarkGray", "blockEnergizedHexoriumMonolithBlue", "blockEnergizedHexoriumMonolithPurple", "blockEnergizedHexoriumMonolithCyan", "blockEnergizedHexoriumMonolithLightGray", "blockEnergizedHexoriumMonolithGray", "blockEnergizedHexoriumMonolithPink", "blockEnergizedHexoriumMonolithLime", "blockEnergizedHexoriumMonolithYellow", "blockEnergizedHexoriumMonolithSkyBlue", "blockEnergizedHexoriumMonolithMagenta", "blockEnergizedHexoriumMonolithOrange", "blockEnergizedHexoriumMonolithWhite", "blockEnergizedHexoriumMonolithTurquoise", "blockEnergizedHexoriumMonolithRainbow"};
	
	public static final short[][] DYES                      = {DYE_Black, DYE_Red, DYE_Green, DYE_Brown, DYE_Blue, DYE_Purple, DYE_Cyan, DYE_LightGray, DYE_Gray, DYE_Pink, DYE_Lime, DYE_Yellow, DYE_LightBlue, DYE_Magenta, DYE_Orange, DYE_White};
	public static final short[][] DYES_INVERTED             = {DYES[15], DYES[14], DYES[13], DYES[12], DYES[11], DYES[10], DYES[ 9], DYES[ 8], DYES[ 7], DYES[ 6], DYES[ 5], DYES[ 4], DYES[ 3], DYES[ 2], DYES[ 1], DYES[ 0]};
	
//	public static final int[] DYES_INT                      = {DYE_INT_Black, DYE_INT_Red, DYE_INT_Green, DYE_INT_Brown, DYE_INT_Blue, DYE_INT_Purple, DYE_INT_Cyan, DYE_INT_LightGray, DYE_INT_Gray, DYE_INT_Pink, DYE_INT_Lime, DYE_INT_Yellow, DYE_INT_LightBlue, DYE_INT_Magenta, DYE_INT_Orange, DYE_INT_White};
//	public static final int[] DYES_INT_INVERTED             = {DYES_INT[15], DYES_INT[14], DYES_INT[13], DYES_INT[12], DYES_INT[11], DYES_INT[10], DYES_INT[ 9], DYES_INT[ 8], DYES_INT[ 7], DYES_INT[ 6], DYES_INT[ 5], DYES_INT[ 4], DYES_INT[ 3], DYES_INT[ 2], DYES_INT[ 1], DYES_INT[ 0]};
	
	public static final FluidStack[] DYED_C_FOAMS           = new FluidStack[16];
	public static final FluidStack[] DYED_C_FOAMS_OWNED     = new FluidStack[16];
	
	public static final FluidStack[] DYE_FLUIDS_WATER       = new FluidStack[16];
	public static final FluidStack[] DYE_FLUIDS_FLOWER      = new FluidStack[16];
	public static final FluidStack[] DYE_FLUIDS_CHEMICAL    = new FluidStack[16];
	public static final FluidStack[][] DYE_FLUIDCATEGORIES  = {DYE_FLUIDS_WATER, DYE_FLUIDS_FLOWER, DYE_FLUIDS_CHEMICAL};
	

	/** Offset for Rendering Text on Surfaces. */
	public static final float PX_OFFSET = 0.005F;
	
	/** Default Size Box. */
	public static final float[] PX_BOX = {0,0,0,1,1,1};
	
	/** Array with length 17 and some overflow containing the Coordinates of Pixels from 0/16 to 16/16 */
	public static final float[] PX_P = {
		  0.0000F, 0.0625F, 0.1250F, 0.1875F
		, 0.2500F, 0.3125F, 0.3750F, 0.4375F
		, 0.5000F, 0.5625F, 0.6250F, 0.6875F
		, 0.7500F, 0.8125F, 0.8750F, 0.9375F
		, 1.0000F, 1.0625F, 1.1250F, 1.1875F
		, 1.2500F, 1.3125F, 1.3750F, 1.4375F
		, 1.5000F, 1.5625F, 1.6250F, 1.6875F
		, 1.7500F, 1.8125F, 1.8750F, 1.9375F
		, 2.0000F}, PIXELS_POS = PX_P;
	
	/** Array with length 17 and some overflow containing the Coordinates of Pixels from 16/16 to 0/16 */
	public static final float[] PX_N = {
		  1.0000F, 0.9375F, 0.8750F, 0.8125F
		, 0.7500F, 0.6875F, 0.6250F, 0.5625F
		, 0.5000F, 0.4375F, 0.3750F, 0.3125F
		, 0.2500F, 0.1875F, 0.1250F, 0.0625F
		, 0.0000F,-0.0625F,-0.1250F,-0.1875F
		,-0.2500F,-0.3125F,-0.3750F,-0.4375F
		,-0.5000F,-0.5625F,-0.6250F,-0.6875F
		,-0.7500F,-0.8125F,-0.8750F,-0.9375F
		,-1.0000F}, PIXELS_NEG = PX_N;
	
	/** Different Side Variables for easier comprehension. */
	public static final byte        SIDE_Y_NEG  = 0, SIDE_BOTTOM    = 0, SIDE_DOWN      = 0,
									SIDE_Y_POS  = 1, SIDE_TOP       = 1, SIDE_UP        = 1,
									SIDE_Z_NEG  = 2, SIDE_NORTH     = 2, // Also a Side with a stupidly mirrored Texture
									SIDE_Z_POS  = 3, SIDE_SOUTH     = 3,
									SIDE_X_NEG  = 4, SIDE_WEST      = 4,
									SIDE_X_POS  = 5, SIDE_EAST      = 5, // Also a Side with a stupidly mirrored Texture
									SIDE_ANY    = 6, SIDE_UNKNOWN   = 6, SIDE_INVALID = 6, SIDE_INSIDE = 6, SIDE_UNDEFINED = 6;
	
	/**
	 * [Facing,Side]->Side Mappings for Blocks, which don't face up- and downwards.
	 * 0 = bottom, 1 = top, 2 = left, 3 = front, 4 = right, 5 = back, 6 = undefined.
	 */
	public static final byte[][] FACING_ROTATIONS = {
		{0,1,2,3,4,5,6,6},
		{0,1,2,3,4,5,6,6},
		{0,1,3,5,4,2,6,6},
		{0,1,5,3,2,4,6,6},
		{0,1,2,4,3,5,6,6},
		{0,1,4,2,5,3,6,6},
		{0,1,2,3,4,5,6,6},
		{0,1,2,3,4,5,6,6}
	};
	
	/**
	 * [Facing,Side]->Orientation Mappings for Blocks, which don't face up- and downwards.
	 * 0 = bottom, 1 = top, 2 = left, 3 = front, 4 = right, 5 = back, 6 = undefined.
	 */
	public static final byte[][] FACING_TO_SIDE = {
		{0,1,2,3,4,5,6,6},
		{0,1,2,3,4,5,6,6},
		{0,1,5,2,4,3,6,6},
		{0,1,4,3,5,2,6,6},
		{0,1,2,4,3,5,6,6},
		{0,1,3,5,2,4,6,6},
		{0,1,2,3,4,5,6,6},
		{0,1,2,3,4,5,6,6}
	};
	
	/** Gives you the Sides, which are not the Front nor the Back of the Facing. */
	public static final byte[][] FACING_SIDES = {{2,3,4,5},{2,3,4,5},{0,1,4,5},{0,1,4,5},{0,1,2,3},{0,1,2,3},{}};
	/** Gives you the Sides, which are the Front and the Back, with the Front being the first one. */
	public static final byte[][] FACING_FRONT_BACK = {{0,1},{1,0},{2,3},{3,2},{4,5},{5,4},{}};
	/** Gives you the Sides, which are the Front and the Back, with the Back being the first one. */
	public static final byte[][] FACING_BACK_FRONT = {{1,0},{0,1},{3,2},{2,3},{5,4},{4,5},{}};
	
	/** Checks if two Sides are along the same Axis */
	public static final boolean[][] ALONG_AXIS = {
		{T,T,F,F,F,F,F,F},
		{T,T,F,F,F,F,F,F},
		{F,F,T,T,F,F,F,F},
		{F,F,T,T,F,F,F,F},
		{F,F,F,F,T,T,F,F},
		{F,F,F,F,T,T,F,F},
		{F,F,F,F,F,F,T,T},
		{F,F,F,F,F,F,T,T}
	};
	
	/** Checks if two Sides are along the shifted Axis */
	public static final boolean[][] ALONG_AXIS_1 = {
		{F,F,T,T,F,F,F,F},
		{F,F,T,T,F,F,F,F},
		{F,F,F,F,T,T,F,F},
		{F,F,F,F,T,T,F,F},
		{T,T,F,F,F,F,F,F},
		{T,T,F,F,F,F,F,F},
		{F,F,F,F,F,F,F,F},
		{F,F,F,F,F,F,F,F}
	};
	
	/** Checks if two Sides are along the double shifted Axis */
	public static final boolean[][] ALONG_AXIS_2 = {
		{F,F,F,F,T,T,F,F},
		{F,F,F,F,T,T,F,F},
		{T,T,F,F,F,F,F,F},
		{T,T,F,F,F,F,F,F},
		{F,F,T,T,F,F,F,F},
		{F,F,T,T,F,F,F,F},
		{F,F,F,F,F,F,F,F},
		{F,F,F,F,F,F,F,F}
	};
	
	/** Insert Facing and a Connectivity BitMask to see if it is connecting to that Side. Technically this is a simple Bit Operation, but accessing an Array with "FACE_CONNECTED[aSide][aConnections]" just looks nicer than "(aConnections & (1 << aSide) != 0)". */
	public static final boolean[][] FACE_CONNECTED = {
		{F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T,F,T},
		{F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T,F,F,T,T},
		{F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T,F,F,F,F,T,T,T,T},
		{F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T},
		{F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T},
		{F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T},
		{F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T}
	};
	
	/** Fast lookup to see how many Connections a Mask has. It is recommended to do either &63 or &127 on the Index depending on how you use it. */
	public static final byte[]              FACE_CONNECTION_COUNT = {0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7};
	
	/** Side Bits for quick reference.*/
	public static final byte[] SBIT = { 1, 2, 4, 8,16,32,64,64};
    public static final byte[] SIDE_BITS = SBIT;
    public static final byte SBIT_D = 1;
    public static final byte SBIT_U = 2;
    public static final byte SBIT_L = 4;
    public static final byte SBIT_F = 8;
    public static final byte SBIT_R = 16;
    public static final byte SBIT_B = 32;
    public static final byte SBIT_N = 4;
    public static final byte SBIT_S = 8;
    public static final byte SBIT_W = 16;
    public static final byte SBIT_E = 32;
    public static final byte SBIT_A = 64;
    public static final byte SBIT_I = 64;
	
	/** Those are not representing actual directions! They are for the "FACING_ROTATIONS" Array-Map */
	public static final byte                SIDE_LEFT = 2, SIDE_FRONT = 3, SIDE_RIGHT = 4, SIDE_BACK = 5;
	
	/** Converts Sides to a Top-Bottom-Side Value, this limits the Range to a Number between [0 and 2] */
	public static final byte[]              FACES_TBS = { 0, 1, 2, 2, 2, 2, 2, 2};
	/** Side->Opposite Mappings. */
	public static final byte[]              OPOS = { 1, 0, 3, 2, 5, 4, 6, 6};
	/** Side->Offset Mappings. */
	public static final byte[]              OFFX = { 0, 0, 0, 0,-1,+1, 0, 0},
											OFFY = {-1,+1, 0, 0, 0, 0, 0, 0},
											OFFZ = { 0, 0,-1,+1, 0, 0, 0, 0};
	@Deprecated
	public static final byte[]              OPPOSITES = OPOS, OFFSETS_X = OFFX, OFFSETS_Y = OFFY, OFFSETS_Z = OFFZ;
	/** 3x3x3 Mappings. */
	public static final byte[]              CUBE_3_X = {0, 0, 0, 0, 0,-1,+1, 0, 0,-1,+1, 0, 0,-1,+1,-1,+1,+1,-1,-1,+1,+1,-1,-1,+1,+1,-1};
    public static final byte[] CUBE_3_Y = {0,-1,+1, 0, 0, 0, 0,-1,-1,-1,-1,+1,+1,+1,+1, 0, 0, 0, 0,-1,-1,-1,-1,+1,+1,+1,+1};
    public static final byte[] CUBE_3_Z = {0, 0, 0,-1,+1, 0, 0,-1,+1, 0, 0,-1,+1, 0, 0,-1,+1,-1,+1,-1,+1,-1,+1,-1,+1,-1,+1};
    public static final byte[][] CUBE_3 = {{ 0, 0, 0}, { 0,-1, 0}, { 0,+1, 0}, { 0, 0,-1}, { 0, 0,+1}, {-1, 0, 0}, {+1, 0, 0}, { 0,-1,-1}, { 0,-1,+1}, {-1,-1, 0}, {+1,-1, 0}, { 0,+1,-1}, { 0,+1,+1}, {-1,+1, 0}, {+1,+1, 0}, {-1, 0,-1}, {+1, 0,+1}, {+1, 0,-1}, {-1, 0,+1}, {-1,-1,-1}, {+1,-1,+1}, {+1,-1,-1}, {-1,-1,+1}, {-1,+1,-1}, {+1,+1,+1}, {+1,+1,-1}, {-1,+1,+1}};

	/** Compass alike Array for the proper ordering of North, East, South and West. */
	public static final byte[]              COMPASS_DIRECTIONS      = {SIDE_NORTH, SIDE_EAST, SIDE_SOUTH, SIDE_WEST};
	/** Side -> Compass Direction. Defaults to North if wrong value. */
	public static final byte[]              COMPASS_FROM_SIDE       = { 0, 0, 0, 2, 3, 1, 0, 0};
	
	/** Rotate */
	public static final byte[]              ROTATE_090              = { 0, 1, 5, 4, 2, 3, 6, 6},
											ROTATE_180              = { 0, 1, 3, 2, 5, 4, 6, 6},
											ROTATE_270              = { 0, 1, 4, 5, 3, 2, 6, 6};
	
	/** Meta -> Side+1 */
	public static final byte[]              META_TO_SIDE_0          = { 0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
											META_TO_SIDE_1          = { 6, 0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6},
											META_TO_SIDE_2          = { 6, 6, 0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6},
											META_TO_SIDE_3          = { 6, 6, 6, 0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6},
											META_TO_SIDE_4          = { 6, 6, 6, 6, 0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6},
											META_TO_SIDE_5          = { 6, 6, 6, 6, 6, 0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6},
											META_TO_SIDE_6          = { 6, 6, 6, 6, 6, 6, 0, 1, 2, 3, 4, 5, 6, 6, 6, 6},
											META_TO_SIDE_7          = { 6, 6, 6, 6, 6, 6, 6, 0, 1, 2, 3, 4, 5, 6, 6, 6},
											META_TO_SIDE_8          = { 6, 6, 6, 6, 6, 6, 6, 6, 0, 1, 2, 3, 4, 5, 6, 6},
											META_TO_SIDE_9          = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 0, 1, 2, 3, 4, 5, 6},
											META_TO_SIDE10          = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 0, 1, 2, 3, 4, 5};
	
	/** Used for Meta => Side */
	public static final byte[]              VALIDATE                = { 0, 1, 2, 3, 4, 5, 0, 0, 0, 1, 2, 3, 4, 5, 0, 0},
											VALIDATE_VERTICAL       = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
											VALIDATE_HORIZONTAL     = { 3, 3, 2, 3, 4, 5, 3, 3, 3, 3, 2, 3, 4, 5, 3, 3};
	
	/** An Array containing all Sides which follow the Condition, in order to iterate over them for example. */
	public static final byte[]              ALL_SIDES                    =  {0,1,2,3,4,5,6};
    public static final byte[] ALL_SIDES_MIDDLE             =  {6,0,1,2,3,4,5};
    public static final byte[] ALL_SIDES_MIDDLE_UP          =  {6,1,2,3,4,5,0};
    public static final byte[] ALL_SIDES_MIDDLE_DOWN        =  {6,0,2,3,4,5,1};
    public static final byte[] ALL_SIDES_VALID              =  {0,1,2,3,4,5  };
    public static final byte[][] ALL_SIDES_VALID_ORDER = {{0,1,2,3,4,5  },{1,2,3,4,5,0  },{2,3,4,5,0,1  },{3,4,5,0,1,2  },{4,5,0,1,2,3  },{5,0,1,2,3,4  },{0,1,2,3,4,5  }};
    public static final byte[][] ALL_SIDES_VALID_FIRST = {{0,1,2,3,4,5  },{1,0,2,3,4,5  },{2,0,1,3,4,5  },{3,0,1,2,4,5  },{4,0,1,2,3,5  },{5,0,1,2,3,4  },{0,1,2,3,4,5  }};
    public static final byte[][] ALL_SIDES_VALID_ONLY = {{0            },{1            },{2            },{3            },{4            },{5            },{0,1,2,3,4,5  }};
    public static final byte[][] ALL_SIDES_VALID_BUT = {{  1,2,3,4,5  },{0  ,2,3,4,5  },{0,1  ,3,4,5  },{0,1,2  ,4,5  },{0,1,2,3  ,5  },{0,1,2,3,4    },{0,1,2,3,4,5  }};
    public static final byte[][] ALL_SIDES_VALID_BUT_AXIS = {{    2,3,4,5  },{    2,3,4,5  },{0,1    ,4,5  },{0,1    ,4,5  },{0,1,2,3      },{0,1,2,3      },{0,1,2,3,4,5  }};
    public static final byte[][] ALL_SIDES_THIS_AND_ANY = {{0          ,6},{1          ,6},{2          ,6},{3          ,6},{4          ,6},{5          ,6},{0,1,2,3,4,5,6}};
    public static final byte[] ALL_SIDES_VERTICAL           =  {0,1};
    public static final byte[] ALL_SIDES_BOTTOM             =  {0};
    public static final byte[] ALL_SIDES_TOP                =  {1};
    public static final byte[][] ALL_SIDES_HORIZONTAL_ORDER = {{2,3,4,5}, {3,4,5,2}, {4,5,2,3}, {5,2,3,4}};
    public static final byte[] ALL_SIDES_HORIZONTAL         =  {2,3,4,5};
    public static final byte[] ALL_SIDES_HORIZONTAL_UP      =  {2,3,4,5,1};
    public static final byte[] ALL_SIDES_HORIZONTAL_DOWN    =  {2,3,4,5,0};
    public static final byte[] ALL_SIDES_BUT_TOP            =  {0,2,3,4,5};
    public static final byte[] ALL_SIDES_BUT_BOTTOM         =  {1,2,3,4,5};
    public static final byte[] ALL_SIDES_X                  =  {4,5};
    public static final byte[] ALL_SIDES_Y                  =  {0,1};
    public static final byte[] ALL_SIDES_Z                  =  {2,3};
	
	/** For Facing Checks. */
	public static final boolean[]           SIDES_BOTTOM            = {T,F,F,F,F,F,F,F},
											SIDES_TOP               = {F,T,F,F,F,F,F,F},
											SIDES_LEFT              = {F,F,T,F,F,F,F,F},
											SIDES_FRONT             = {F,F,F,T,F,F,F,F},
											SIDES_RIGHT             = {F,F,F,F,T,F,F,F},
											SIDES_BACK              = {F,F,F,F,F,T,F,F},
											SIDES_INVALID           = {F,F,F,F,F,F,T,T},
											SIDES_VALID             = {T,T,T,T,T,T,F,F},
											SIDES_ALL               = {T,T,T,T,T,T,T,T},
											SIDES_NONE              = {F,F,F,F,F,F,F,F},
											SIDES_LEFT_RIGHT        = {F,F,T,F,T,F,F,F},
											SIDES_FRONT_BACK        = {F,F,F,T,F,T,F,F},
											SIDES_AXIS_X            = {F,F,F,F,T,T,F,F},
											SIDES_AXIS_Y            = {T,T,F,F,F,F,F,F},
											SIDES_AXIS_Z            = {F,F,T,T,F,F,F,F},
											SIDES_COMPASS           = {F,F,T,T,T,T,F,F},
											SIDES_VERTICAL          = {T,T,F,F,F,F,F,F},
											SIDES_HORIZONTAL        = {F,F,T,T,T,T,F,F},
											SIDES_TOP_HORIZONTAL    = {F,T,T,T,T,T,F,F},
											SIDES_BOTTOM_HORIZONTAL = {T,F,T,T,T,T,F,F},
											SIDES_ITEM_RENDER       = {T,T,T,T,T,T,F,F};
	
	/** For Facing Checks. */
	public static final boolean[][]
	SIDES_ANY_BUT = {
		{F,T,T,T,T,T,F,F},
		{T,F,T,T,T,T,F,F},
		{T,T,F,T,T,T,F,F},
		{T,T,T,F,T,T,F,F},
		{T,T,T,T,F,T,F,F},
		{T,T,T,T,T,F,F,F},
		{T,T,T,T,T,T,F,F},
		{T,T,T,T,T,T,F,F}
	},
	SIDES_THIS = {
		{T,F,F,F,F,F,F,F},
		{F,T,F,F,F,F,F,F},
		{F,F,T,F,F,F,F,F},
		{F,F,F,T,F,F,F,F},
		{F,F,F,F,T,F,F,F},
		{F,F,F,F,F,T,F,F},
		{F,F,F,F,F,F,F,F},
		{F,F,F,F,F,F,F,F}
	},
	SIDES_EQUAL = {
		{T,F,F,F,F,F,T,T},
		{F,T,F,F,F,F,T,T},
		{F,F,T,F,F,F,T,T},
		{F,F,F,T,F,F,T,T},
		{F,F,F,F,T,F,T,T},
		{F,F,F,F,F,T,T,T},
		{T,T,T,T,T,T,T,T},
		{T,T,T,T,T,T,T,T}
	},
	SIDES_UNEQUAL = {
		{F,T,T,T,T,T,F,F},
		{T,F,T,T,T,T,F,F},
		{T,T,F,T,T,T,F,F},
		{T,T,T,F,T,T,F,F},
		{T,T,T,T,F,T,F,F},
		{T,T,T,T,T,F,F,F},
		{F,F,F,F,F,F,F,F},
		{F,F,F,F,F,F,F,F}
	},
	AXIS_XYZ = {
		SIDES_NONE,
		SIDES_AXIS_X,
		SIDES_AXIS_Y,
		SIDES_AXIS_Z
	};
	
	/** Pillar Stuff for more understandable references. */
	public static final byte PILLAR_X = 4;
    public static final byte PILLAR_Y = 0;
    public static final byte PILLAR_Z = 8;
    public static final byte PILLAR_BITS = 12;
    public static final byte PILLAR_DATA = 3;
    public static final byte PILLAR_RENDER = 31;
    public static final byte[] PILLARS_X = {4,5,6,7};
    public static final byte[] PILLARS_Y = {0,1,2,3};
    public static final byte[] PILLARS_Z = {8,9,10,11};
    public static final byte[] PILLAR_BITS_SIDE = {0,0,8,8,4,4,0,0};
    public static final byte[][] PILLAR_DATA_SIDE = {
	  {0,0,8,8,4,4,0,0}, {1,1,9,9,5,5,1,1}, {2,2,10,10,6,6,2,2}, {3,3,11,11,7,7,3,3}
	, {0,0,8,8,4,4,0,0}, {1,1,9,9,5,5,1,1}, {2,2,10,10,6,6,2,2}, {3,3,11,11,7,7,3,3}
	, {0,0,8,8,4,4,0,0}, {1,1,9,9,5,5,1,1}, {2,2,10,10,6,6,2,2}, {3,3,11,11,7,7,3,3}
	// Pillar Blocks that are fully covered in "Bark" (if they were Logs)
	, {12,12,12,12,12,12,12,12}
	, {13,13,13,13,13,13,13,13}
	, {14,14,14,14,14,14,14,14}
	, {15,15,15,15,15,15,15,15}
	};
	/** Pillar Axis Stuff for more understandable references. */
	public static final boolean[][] PILLAR_TO_AXIS = {
		SIDES_AXIS_Y, SIDES_AXIS_Y, SIDES_AXIS_Y, SIDES_AXIS_Y,
		SIDES_AXIS_X, SIDES_AXIS_X, SIDES_AXIS_X, SIDES_AXIS_X,
		SIDES_AXIS_Z, SIDES_AXIS_Z, SIDES_AXIS_Z, SIDES_AXIS_Z,
		SIDES_NONE  , SIDES_NONE  , SIDES_NONE  , SIDES_NONE  ,
	};
	
	/** Used for Networking Covers, for the most Part. */
	public static final boolean[] TRUE_6 = {T,T,T,T,T,T};
	
	/** To Scan Coordinates in a somewhat "close stuff gets scanned first" order. */
	public static final int[]
	  SCAN_NEG_0 = {0};
    public static final int[] SCAN_NEG_1 = {0, -1, +1};
    public static final int[] SCAN_NEG_2 = {0, -1, +1, -2, +2};
    public static final int[] SCAN_NEG_3 = {0, -1, +1, -2, +2, -3, +3};
    public static final int[] SCAN_NEG_4 = {0, -1, +1, -2, +2, -3, +3, -4, +4};
    public static final int[] SCAN_NEG_5 = {0, -1, +1, -2, +2, -3, +3, -4, +4, -5, +5};
    public static final int[] SCAN_NEG_6 = {0, -1, +1, -2, +2, -3, +3, -4, +4, -5, +5, -6, +6};
    public static final int[] SCAN_NEG_7 = {0, -1, +1, -2, +2, -3, +3, -4, +4, -5, +5, -6, +6, -7, +7};
    public static final int[] SCAN_NEG_8 = {0, -1, +1, -2, +2, -3, +3, -4, +4, -5, +5, -6, +6, -7, +7, -8, +8};
    public static final int[] SCAN_NEG_9 = {0, -1, +1, -2, +2, -3, +3, -4, +4, -5, +5, -6, +6, -7, +7, -8, +8, -9, +9};

    public static final int[] SCAN_POS_0 = {0};
    public static final int[] SCAN_POS_1 = {0, +1, -1};
    public static final int[] SCAN_POS_2 = {0, +1, -1, +2, -2};
    public static final int[] SCAN_POS_3 = {0, +1, -1, +2, -2, +3, -3};
    public static final int[] SCAN_POS_4 = {0, +1, -1, +2, -2, +3, -3, +4, -4};
    public static final int[] SCAN_POS_5 = {0, +1, -1, +2, -2, +3, -3, +4, -4, +5, -5};
    public static final int[] SCAN_POS_6 = {0, +1, -1, +2, -2, +3, -3, +4, -4, +5, -5, +6, -6};
    public static final int[] SCAN_POS_7 = {0, +1, -1, +2, -2, +3, -3, +4, -4, +5, -5, +6, -6, +7, -7};
    public static final int[] SCAN_POS_8 = {0, +1, -1, +2, -2, +3, -3, +4, -4, +5, -5, +6, -6, +7, -7, +8, -8};
    public static final int[] SCAN_POS_9 = {0, +1, -1, +2, -2, +3, -3, +4, -4, +5, -5, +6, -6, +7, -7, +8, -8, +9, -9};

    public static final int[][] SCANS_POS = {SCAN_POS_0, SCAN_POS_1, SCAN_POS_2, SCAN_POS_3, SCAN_POS_4, SCAN_POS_5, SCAN_POS_6, SCAN_POS_7, SCAN_POS_8, SCAN_POS_9};
    public static final int[][] SCANS_NEG = {SCAN_NEG_0, SCAN_NEG_1, SCAN_NEG_2, SCAN_NEG_3, SCAN_NEG_4, SCAN_NEG_5, SCAN_NEG_6, SCAN_NEG_7, SCAN_NEG_8, SCAN_NEG_9}
	;


	/** This way it is possible to have a Call Hierarchy of NullPointers in ItemStack based Functions, and also because most of the time I don't know what kind of Data Type the "null" stands for, when there are shitloads of Parameters for a Function */
	public static final ItemStack NI = null;

	/** This way it is possible to have a Call Hierarchy of NullPointers in FluidStack based Functions, and also because most of the time I don't know what kind of Data Type the "null" stands for, when there are shitloads of Parameters for a Function */
	public static final FluidStack NF = null;

	/** This way it is possible to have a Call Hierarchy of NullPointers in Block based Functions, and also because most of the time I don't know what kind of Data Type the "null" stands for, when there are shitloads of Parameters for a Function */
	public static final Block NB = Blocks.AIR;

	/** States of Matter */
	public static final byte STATE_SOLID = 0, STATE_LIQUID = 1, STATE_GASEOUS = 2, STATE_PLASMA = 3;
	
	/** The weight of Air at Atmospheric Pressure per Cubic Centimetre. */
	public static final double WEIGHT_AIR_G_PER_CUBIC_CENTIMETER = 0.0012;
	/** The weight of Air at Atmospheric Pressure per Cubic Meter. */
	public static final double WEIGHT_AIR_KG_PER_CUBIC_METER = 1.2;
	/** The weight of Air at Atmospheric Pressure per Material Unit. */
	public static final double WEIGHT_AIR_KG_PER_UNIT = WEIGHT_AIR_KG_PER_CUBIC_METER / 9;
	
	/** Not really Constants, but they set using the Config and therefore should be constant. */
	public static boolean D1 = F, D2 = F, D3 = F, ALWAYS_TRUE = T, ALWAYS_FALSE = F, EXPERIMENTS = F, CLIENT_BLOCKUPDATE_SOUNDS = F, NEI = F, TOOL_SOUNDS = T, TOOL_SOUNDS_SETTING = T, EMIT_EU_AS_RF = F, DISABLE_GT6_CRAFTING_RECIPES = F, ENABLE_ADDING_IC2_MACERATOR_RECIPES = T, DISABLE_ALL_IC2_MACERATOR_RECIPES = F, ENABLE_ADDING_IC2_EXTRACTOR_RECIPES = T, DISABLE_ALL_IC2_EXTRACTOR_RECIPES = F, ENABLE_ADDING_IC2_COMPRESSOR_RECIPES = T, DISABLE_ALL_IC2_COMPRESSOR_RECIPES = F, ENABLE_ADDING_IC2_OREWASHER_RECIPES = T, DISABLE_ALL_IC2_OREWASHER_RECIPES = F, ENABLE_ADDING_IC2_CENTRIFUGE_RECIPES = T, DISABLE_ALL_IC2_CENTRIFUGE_RECIPES = F, SLOW_LEAF_DECAY = F, FAST_LEAF_DECAY = T, FORCE_GRAVEL_NO_FLINT = F, NERFED_WOOD = T, FOOD_OVERDOSE_DEATH = T, NUTRITION_SYSTEM = T, OBSTRUCTION_CHECKS = T, OWNERSHIP_RESET = F, SPAWN_ZONE_MOB_PROTECTION = T, SPAWN_NO_BATS = T, SPAWN_HOSTILES_ONLY_IN_DARKNESS = T, CONSTANT_ENERGY = T, RAIN_EXPLOSIONS = F, WATER_EXPLOSIONS = F, THUNDER_EXPLOSIONS = F, FIRE_EXPLOSIONS = F, OVERCHARGE_EXPLOSIONS = F, FIRE_BREAKING = F, RAIN_BREAKING = F, WATER_BREAKING = F, THUNDER_BREAKING = F, OVERCHARGE_BREAKING = F, SHOW_MICROBLOCKS = F, SHOW_CHEM_FORMULAS = T, SHOW_INTERNAL_NAMES = F, SHOW_HIDDEN_MATERIALS = F, SHOW_HIDDEN_PREFIXES = F, SHOW_ORE_BLOCK_PREFIXES = F, SHOW_HIDDEN_ITEMS = F, SHOW_BUMBLEBEES = F, DRINKS_ALWAYS_DRINKABLE = F, HUNGER_BY_INVENTORY_WEIGHT = F, TOOL_BREAK_FATIQUE = T, INVENTORY_UNIFICATION = T, XP_ORB_COMBINING = T, ADVENTURE_MODE_KIT = F, SURVIVAL_INTO_ADVENTURE_MODE = F, MOBS_DROP_LEAD = T, MOBS_DROP_MEAT = T, MOBS_DROP_JUNK = T, MOBS_DROP_BOOK = T, MOBS_DROP_NAME = T, ZOMBIES_DIG_WITH_TOOLS = F, ZOMBIES_DIG_TILEENTITIES = F, ZOMBIES_HOLD_PICKAXES = T, ZOMBIES_HOLD_TNT = T, ZOMBIES_IGNITE_HELD_TNT = T, DISPLAY_TEMP_TOOLTIP = T, GENERATE_STONE = T, GENERATE_STREETS = F, GENERATE_NEXUS = F, GENERATE_TESTING = F, GENERATE_BEACON = F, GENERATE_BIOMES = F, GENERATING_SPECIAL = F;
	/** Date based Shenanigans */
	@SuppressWarnings("deprecation")
	public static boolean
	APRIL_FOOLS      = (new Date().getMonth() ==  3 && new Date().getDate() <=  2),
	WOODMANS_BDAY    = (new Date().getMonth() ==  5 && new Date().getDate() >= 21),
	XMAS_IN_JULY     = (new Date().getMonth() ==  6 && new Date().getDate() >= 23),
	XMAS_IN_DECEMBER = (new Date().getMonth() == 11 && new Date().getDate() >=  6);
	/** This means that Client or Server specific Base Files are definitely existing and loaded! Not if the World is actually client side or server side! */
	public static boolean CODE_UNCHECKED = T, CODE_CLIENT = F, CODE_SERVER = F;
	
	/** Not really Constants, but they set using the Config and therefore should be constant. */
	public static double HARDNESS_MULTIPLIER_SAND = 1.0, HARDNESS_MULTIPLIER_ROCK = 1.0, HARDNESS_MULTIPLIER_ORES = 1.0;
	/** Those are the values derived directly by the Configuration File. DO NOT USE THEM, USE THE VALUES ABOVE INSTEAD!!! */
	public static double CONFIG_HARDNESS_MULTIPLIER_SAND = 1.0, CONFIG_HARDNESS_MULTIPLIER_ROCK = 1.0, CONFIG_HARDNESS_MULTIPLIER_ORES = 1.0;
	/** Tree Growth Time Multiplier. */
	public static int TREE_GROWTH_TIME = 1;
	/** TFC Damage Multiplier. */
	public static int TFC_DAMAGE_MULTIPLIER = 80;
	/** Entity Cramming */
	public static int ENTITY_CRAMMING = 3;
	/** Item Related */
	public static int ITEM_DESPAWN_TIME = 6000;

	/** Dimension Types that I use as parameter for my WorldGenerators, aside from the Vanilla Dimension IDs none of these IDs is accurate as they are just the Defaults of their Respective Mods! */
	public static final int DIM_UNKNOWN = Integer.MAX_VALUE
	, DIM_OVERWORLD = 0
	, DIM_NETHER = -1
	, DIM_END = 1
	, DIM_ENVM = -2
	, DIM_A97 = -6 // Collides with Aether by default
	, DIM_ELDRITCH = -42
	, DIM_CW2_AquaCavern = -32
	, DIM_CW2_Caveland = -33
	, DIM_CW2_Cavenia = -34
	, DIM_CW2_Cavern = -31
	, DIM_CW2_Caveworld = -30
	, DIM_MOON = 2
	, DIM_MARS = 3
	, DIM_ASTEROIDS = 4
	, DIM_PLANETS = 5
	, DIM_AETHER = 6
	, DIM_TWILIGHT = 7
	, DIM_ATUM = 17
	, DIM_BETWEENLANDS = 20
	, DIM_FROZEN_HEARTH = 21
	, DIM_SOUL_FOREST = 22
	, DIM_CANDY = 23
	, DIM_EREBUS = 66
	, DIM_ALFHEIM = 105
	, DIM_DEEPDARK = -100
	, DIM_LASTMILLENIUM = -112
	, DIM_TROPICS = -127
	;


	/** A Set of different Tool Names. */
	public static final String
	  TOOL_LOCALISER_PREFIX = "gt.lang.tool.name."
	, TOOL_TOOLTIP_PREFIX   = "gt.lang.tool.tooltip."
	, TOOL_rotator          = "rotator"
	, TOOL_igniter          = "igniter"
	, TOOL_extinguisher     = "extinguisher"
	, TOOL_whacker          = "whacker"
	, TOOL_wrench           = "wrench"
	, TOOL_monkeywrench     = "monkeywrench"
	, TOOL_crowbar          = "crowbar"
	, TOOL_pincers          = "pincers"
	, TOOL_axe              = "axe"
	, TOOL_pickaxe          = "pickaxe"
	, TOOL_knife            = "knife"
	, TOOL_sword            = "sword"
	, TOOL_shovel           = "shovel"
	, TOOL_hoe              = "hoe"
	, TOOL_grafter          = "grafter"
	, TOOL_saw              = "saw"
	, TOOL_file             = "file"
	, TOOL_hammer           = "hammer"
	, TOOL_plow             = "plow"
	, TOOL_plunger          = "plunger"
	, TOOL_scoop            = "scoop"
	, TOOL_shears           = "shears"
	, TOOL_scissors         = "scissors"
	, TOOL_screwdriver      = "screwdriver"
	, TOOL_drill            = "drill"
	, TOOL_mixer            = "mixer"
	, TOOL_chisel           = "chisel"
	, TOOL_sense            = "sense"
	, TOOL_scythe           = "scythe"
	, TOOL_softhammer       = "softhammer"
	, TOOL_cutter           = "cutter"
	, TOOL_plasmatorch      = "plasmatorch"
	, TOOL_solderingtool    = "solderingtool"
	, TOOL_solderingmetal   = "solderingmetal"
	, TOOL_thermometer      = "thermometer"
	, TOOL_magnifyingglass  = "magnifyingglass"
	, TOOL_geigercounter    = "geigercounter"
	, TOOL_electrometer     = "electrometer"
	, TOOL_tachometer       = "tachometer"
	, TOOL_prospector       = "prospector"
	, TOOL_ducttape         = "ducttape"
	;

	
	/** A Set of different NBT Keys I use for Stuff. */
	public static final String
	  NBT_HIDDEN                    = "gt.hidden"                   // Boolean
	, NBT_COLOR                     = "gt.color"                    // Integer
	, NBT_PAINTED                   = "gt.painted"                  // Boolean
	, NBT_TEXTURE                   = "gt.texture"                  // String
	, NBT_DESIGNS                   = "gt.designs"                  // Number
	, NBT_DESIGN                    = "gt.design"                   // Number
	, NBT_GUI                       = "gt.gui"                      // String
	, NBT_OWNABLE                   = "gt.ownable"                  // Boolean
	, NBT_OWNER                     = "gt.owner"                    // String
	, NBT_KEY                       = "gt.key"                      // Number
	, NBT_OPEN                      = "gt.open"                     // Boolean
	, NBT_FLUSH                     = "gt.flush"                    // Boolean
	, NBT_MODE                      = "gt.mode"                     // Number
	, NBT_STATE                     = "gt.state"                    // Number
	, NBT_MINENERGY                 = "gt.minenergy"                // Number
	, NBT_PROGRESS                  = "gt.progress"                 // Number
	, NBT_MAXPROGRESS               = "gt.maxprogress"              // Number
	, NBT_DISTANCE                  = "gt.distance"                 // Number
	, NBT_THROUGHPUT                = "gt.througput"                // Number
	, NBT_PARALLEL                  = "gt.parallel"                 // Number
	, NBT_PARALLEL_DURATION         = "gt.paradura"                 // Boolean
	, NBT_NUCLEAR_SELF              = "gt.nuclear.self"             // Number
	, NBT_NUCLEAR_OTHER             = "gt.nuclear.other"            // Number
	, NBT_NUCLEAR_DIV               = "gt.nuclear.div"              // Number
	, NBT_NUCLEAR_MAX               = "gt.nuclear.max"              // Number
	, NBT_NUCLEAR_MOD               = "gt.nuclear.mod"              // Number
	, NBT_NUCLEAR_LOSS              = "gt.nuclear.loss"             // Number
	, NBT_DURABILITY                = "gt.durability"               // Number
	, NBT_MAXDURABILITY             = "gt.maxdurability"            // Number
	, NBT_QUALITY                   = "gt.quality"                  // Byte
	, NBT_FORTUNE                   = "gt.fortune"                  // Byte
	, NBT_FACING                    = "gt.facing"                   // Byte
	, NBT_FAC2NG                    = "gt.facing.2nd"               // Byte
	, NBT_FAC3NG                    = "gt.facing.3rd"               // Byte
	, NBT_CONNECTION                = "gt.connection"               // Byte
	, NBT_DIAMETER                  = "gt.diameter"                 // Double
	, NBT_PIPELOSS                  = "gt.pipeloss"                 // Long
	, NBT_PIPERANGE                 = "gt.piperange"                // Long
	, NBT_PIPEBANDWIDTH             = "gt.pipebandwidth"            // Long
	, NBT_PIPESIZE                  = "gt.pipesize"                 // Long
	, NBT_PIPERENDER                = "gt.piperender"               // Byte
	, NBT_LIQUIDPROOF               = "gt.liquidproof"              // Boolean
	, NBT_GASPROOF                  = "gt.gasproof"                 // Boolean
	, NBT_ACIDPROOF                 = "gt.acidproof"                // Boolean
	, NBT_MAGICPROOF                = "gt.magicproof"               // Boolean
	, NBT_PLASMAPROOF               = "gt.plasmaproof"              // Boolean
	, NBT_CONTACTDAMAGE             = "gt.contactdamage"            // Boolean
	, NBT_OPAQUE                    = "gt.opaque"                   // Boolean
	, NBT_TRANSPARENT               = "gt.transparent"              // Boolean
	, NBT_WASTE_ENERGY              = "gt.wasteenergy"              // Boolean
	, NBT_LIMIT_CONSUMPTION         = "gt.limit.consumption"        // Boolean
	, NBT_IGNITION                  = "gt.ignite"                   // Boolean or Number
	, NBT_NEEDS_IGNITION            = "gt.needignite"               // Boolean
	, NBT_USE_OUTPUT_TANK           = "gt.useouttank"               // Boolean
	, NBT_FOAMED                    = "gt.foamed"                   // Boolean
	, NBT_FOAMDRIED                 = "gt.foamdried"                // Boolean
	, NBT_VISUAL                    = "gt.visual"                   // Number or Boolean
	, NBT_PISTON                    = "gt.piston"                   // Number
	, NBT_VALUE                     = "gt.value"                    // Number
	, NBT_TARGET                    = "gt.target"                   // Boolean
	, NBT_TARGET_X                  = "gt.target.x"                 // Number
	, NBT_TARGET_Y                  = "gt.target.y"                 // Number
	, NBT_TARGET_Z                  = "gt.target.z"                 // Number
	, NBT_ACTIVE                    = "gt.active"                   // Boolean containing the active State of a Block.
	, NBT_ACTIVE_DATA               = "gt.active.data"              // Number
	, NBT_ACTIVE_ENERGY             = "gt.active.energy"            // Boolean
	, NBT_CAN_ENERGY                = "gt.can.energy"               // Boolean
	, NBT_HARDNESS                  = "gt.hardness"                 // Float
	, NBT_RESISTANCE                = "gt.resistance"               // Float
	, NBT_FLAMMABILITY              = "gt.flammability"             // Integer
	, NBT_COOLDOWN                  = "gt.cooldown"                 // Number
	, NBT_TRAPPED                   = "gt.trapped"                  // Boolean
	, NBT_REDSTONE                  = "gt.redstone"                 // Byte
	, NBT_REDSTONE_0                = "gt.redstone.0"               // Byte
	, NBT_REDSTONE_1                = "gt.redstone.1"               // Byte
	, NBT_REDSTONE_2                = "gt.redstone.2"               // Byte
	, NBT_REDSTONE_3                = "gt.redstone.3"               // Byte
	, NBT_REDSTONE_4                = "gt.redstone.4"               // Byte
	, NBT_REDSTONE_5                = "gt.redstone.5"               // Byte
	, NBT_INVERTED                  = "gt.inverted"                 // Boolean signalising if the Machine is set to inverse.
	, NBT_REVERSED                  = "gt.reversed"                 // Boolean signalising if the Machine is set to reverse.
	, NBT_STOPPED                   = "gt.stopped"                  // Boolean signalising if the Machine is set to stop.
	, NBT_RUNNING                   = "gt.running"                  // Boolean signalising if the Machine is set up to run.
	, NBT_SPECIAL_IS_START_ENERGY   = "gt.special.start.energy"     // Boolean
	, NBT_CHEAP_OVERCLOCKING        = "gt.cheap.overclocking"       // Boolean
	, NBT_NO_CONSTANT_POWER         = "gt.no.constant.power"        // Boolean
	, NBT_EFFICIENCY                = "gt.eff"                      // Short from 0 to 10000 describing the Efficiency of a Generator or Converter.
	, NBT_MULTIPLIER                = "gt.multiplier"               // Number
	, NBT_INV_SIZE                  = "gt.invsize"                  // Short
	, NBT_INV_LIST                  = "gt.invlist"                  // NBT List
	, NBT_INV_FILTER                = "gt.invfilter"                // NBT List
	, NBT_INV_OUT                   = "gt.invout"                   // NBT containing an Output Item. usually postfixed with ".i", 'i' being the index.
	, NBT_INV_SIDE_IN               = "gt.invsidein"                // Byte
	, NBT_INV_SIDE_OUT              = "gt.invsideout"               // Byte
	, NBT_INV_SIDE_AUTO_IN          = "gt.invsideautoin"            // Byte
	, NBT_INV_SIDE_AUTO_OUT         = "gt.invsideautoout"           // Byte
	, NBT_INV_DISABLED_IN           = "gt.invdisabledin"            // Boolean
	, NBT_INV_DISABLED_OUT          = "gt.invdisabledout"           // Boolean
	, NBT_TANK                      = "gt.tank"                     // NBT containing a Tank. usually postfixed with ".i", 'i' being the index.
	, NBT_TANK_FILTER               = "gt.tankfilter"               // NBT List
	, NBT_TANK_OUT                  = "gt.tankout"                  // NBT containing an Output Fluid. usually postfixed with ".i", 'i' being the index.
	, NBT_TANK_COUNT                = "gt.tankcount"                // Number
	, NBT_TANK_CAPACITY             = "gt.tankcap"                  // Number
	, NBT_TANK_SIDE_IN              = "gt.tanksidein"               // Byte
	, NBT_TANK_SIDE_OUT             = "gt.tanksideout"              // Byte
	, NBT_TANK_SIDE_AUTO_IN         = "gt.tanksideautoin"           // Byte
	, NBT_TANK_SIDE_AUTO_OUT        = "gt.tanksideautoout"          // Byte
	, NBT_TANK_DISABLED_IN          = "gt.tankdisabledin"           // Boolean
	, NBT_TANK_DISABLED_OUT         = "gt.tankdisabledout"          // Boolean
	, NBT_COVERS                    = "gt.covers"                   // Tag Compound with 24 Tags.
	, NBT_RECIPEMAP                 = "gt.recipemap"                // String containing the Recipe Map Name.
	, NBT_FUELMAP                   = "gt.fuelmap"                  // String containing the Fuel Map Name.
	, NBT_TEMPERATURE               = "gt.temperature"              // Long containing a generic Temperature Variable.
	, NBT_MTE_REG                   = "gt.mte.reg"                  // Containing the MTE Registry ID
	, NBT_MTE_ID                    = "gt.mte.id"                   // Containing the MTE ID
	, NBT_USB_DIRECTION             = "gt.usb.dir"                  // Compound
	, NBT_USB_TIER                  = "gt.usb.tier"                 // Byte
	, NBT_USB_DATA                  = "gt.usb.data"                 // Compound
	, NBT_USB_DRIVE                 = "gt.usb.drive"                // Compound
	, NBT_CANVAS_BLOCK              = "gt.canvas.block"             // Short
	, NBT_CANVAS_META               = "gt.canvas.meta"              // Short
	, NBT_REPLICATOR_DATA           = "gt.replicator.data"          // Short
	, NBT_REACTOR_SETUP             = "gt.reactor.setup"            // Short
	, NBT_REACTOR_SETUP_NAME        = "gt.reactor.setup.name"       // String
	, NBT_AMMO                      = "gt.ammo"                     // ItemStack, see ST.save or ST.load
	
	, NBT_RECYCLING_COMPS           = "gt.recycling.comps"          // List of Components for the Disassembler.
	, NBT_RECYCLING_MATS            = "gt.recycling.mats"           // List of Materials this Item recycles into. OM.anydata(ItemStack aStack) will check for this NBT, but only AFTER the Server already started!
	, NBT_FUEL_VALUE                = "gt.fuelvalue"                // Short
	, NBT_EFFECTS                   = "gt.effects"                  // Compound
	
	, NBT_MATERIAL                  = "gt.material"                 // String containing the Material Name.
	, NBT_MATERIALS                 = "gt.materials"                // Containing the Data of an Array of Material Stacks.
	
	, NBT_ENERGY_EMITTED            = "gt.energy.emitted"           // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_2          = "gt.energy.emitted.2"         // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_SIDES      = "gt.energy.emitted.sides"     // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_TOP        = "gt.energy.emitted.top"       // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_BOTTOM     = "gt.energy.emitted.bottom"    // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_FRONT      = "gt.energy.emitted.front"     // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_BACK       = "gt.energy.emitted.back"      // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_LEFT       = "gt.energy.emitted.left"      // String containing the Type of emitted Energy.
	, NBT_ENERGY_EMITTED_RIGHT      = "gt.energy.emitted.right"     // String containing the Type of emitted Energy.
	
	, NBT_ENERGY_ACCEPTED           = "gt.energy.accepted"          // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_2         = "gt.energy.accepted.2"        // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_SIDES     = "gt.energy.accepted.sides"    // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_TOP       = "gt.energy.accepted.top"      // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_BOTTOM    = "gt.energy.accepted.bottom"   // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_FRONT     = "gt.energy.accepted.front"    // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_BACK      = "gt.energy.accepted.back"     // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_LEFT      = "gt.energy.accepted.left"     // String containing the Type of accepted Energy.
	, NBT_ENERGY_ACCEPTED_RIGHT     = "gt.energy.accepted.right"    // String containing the Type of accepted Energy.
	
	, NBT_INPUT                     = "gt.input"                    // Long containing a generic Energy Variable.
	, NBT_INPUT_MIN                 = "gt.input.min"                // Long containing a generic Energy Variable.
	, NBT_INPUT_MAX                 = "gt.input.max"                // Long containing a generic Energy Variable.
	, NBT_INPUT_EU                  = "gt.input.eu"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_RU                  = "gt.input.ru"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_KU                  = "gt.input.ku"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_HU                  = "gt.input.hu"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_LU                  = "gt.input.lu"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_SU                  = "gt.input.su"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_AU                  = "gt.input.au"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_MJ                  = "gt.input.mj"                 // Long containing a specified Energy Variable.
	, NBT_INPUT_RF                  = "gt.input.rf"                 // Long containing a specified Energy Variable.
	
	, NBT_OUTPUT                    = "gt.output"                   // Long containing a generic Energy Variable.
	, NBT_OUTPUT_MIN                = "gt.output.min"               // Long containing a generic Energy Variable.
	, NBT_OUTPUT_MAX                = "gt.output.max"               // Long containing a generic Energy Variable.
	, NBT_OUTPUT_EU                 = "gt.output.eu"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_RU                 = "gt.output.ru"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_KU                 = "gt.output.ku"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_HU                 = "gt.output.hu"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_LU                 = "gt.output.lu"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_SU                 = "gt.output.su"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_AU                 = "gt.output.au"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_MJ                 = "gt.output.mj"                // Long containing a specified Energy Variable.
	, NBT_OUTPUT_RF                 = "gt.output.rf"                // Long containing a specified Energy Variable.
	
	, NBT_ENERGY                    = "gt.energy"                   // Long containing a generic Energy Variable.
	, NBT_ENERGY_EU                 = "gt.energy.eu"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_RU                 = "gt.energy.ru"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_KU                 = "gt.energy.ku"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_HU                 = "gt.energy.hu"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_LU                 = "gt.energy.lu"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_SU                 = "gt.energy.su"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_AU                 = "gt.energy.au"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_MJ                 = "gt.energy.mj"                // Long containing a specified Energy Variable.
	, NBT_ENERGY_RF                 = "gt.energy.rf"                // Long containing a specified Energy Variable.
	
	, NBT_CAPACITY                  = "gt.capacity"                 // Long containing a generic Energy Variable as Capacity.
	, NBT_CAPACITY_EU               = "gt.capacity.eu"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_RU               = "gt.capacity.ru"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_KU               = "gt.capacity.ku"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_HU               = "gt.capacity.hu"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_LU               = "gt.capacity.lu"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_SU               = "gt.capacity.su"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_AU               = "gt.capacity.au"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_MJ               = "gt.capacity.mj"              // Long containing a specified Energy Variable as Capacity.
	, NBT_CAPACITY_RF               = "gt.capacity.rf"              // Long containing a specified Energy Variable as Capacity.
	;

	/** Contains typical Tool OreDict Names. */
	public static class OreDictToolNames {
		public static final String
		hac_mortar = "toolMortarandpestle",
		hac_cuttingboard = "toolCuttingboard",
		saw = "craftingToolSaw",
		hoe = "craftingToolHoe",
		axe = "craftingToolAxe",
		file = "craftingToolFile",
		plow = "craftingToolPlow",
		mixer = "craftingToolMixer",
		sword = "craftingToolSword",
		scoop = "craftingToolScoop",
		knife = "craftingToolKnife",
		blade = "craftingToolBlade",
		mortar = "craftingToolMortar",
		shovel = "craftingToolShovel",
		wrench = "craftingToolWrench",
		chisel = "craftingToolChisel",
		shears = "craftingToolShears",
		sawaxe = "craftingToolSawAxe",
		pincers = "craftingToolPincers",
		plunger = "craftingToolPlunger",
		crowbar = "craftingToolCrowbar",
		pickaxe = "craftingToolPickaxe",
		scissors = "craftingToolScissors",
		drawplate = "craftingToolDrawplate",
		drill = "craftingToolDrill",
		handdrill = "craftingToolHandDrill",
		rollingpin = "craftingToolRollingPin",
		wirecutter = "craftingToolWireCutter",
		hammer = "craftingToolHardHammer",
		softhammer = "craftingToolSoftHammer",
		jackhammer = "craftingToolJackHammer",
		forgehammer = "craftingToolForgeHammer",
		miningdrill = "craftingToolMiningDrill",
		screwdriver = "craftingToolScrewdriver",
		monkeywrench = "craftingToolMonkeyWrench",
		branchcutter = "craftingToolBranchCutter",
		solderingiron = "craftingToolSolderingIron",
		flintandtinder = "craftingToolFlintAndTinder",
		solderingmetal = "craftingToolSolderingMetal",
		magnifyingglass = "craftingToolMagnifyingGlass",
		bendingcylinder = "craftingToolBendingCylinder",
		bendingcylindersmall = "craftingToolBendingCylinderSmall";
	}

	/** Contains TextureSet Indices for non OreDictPrefixed Stuff. */
	public static class IconsGT {
		public static int INDEX_BLOCK_MOLTEN = 0, INDEX_BLOCK_GAS = 0, INDEX_BLOCK_PLASMA = 0, INDEX_BLOCK_PIPE_SIDE = 0;
	}

	/** Files */
	public static class DirectoriesGT {
		public static File
		MINECRAFT,
		LOGS,
		CONFIG,
		CONFIG_GT,
		CONFIG_RECIPES;
	}


	/** Class Containing MOD ID Strings used in GT, since they are very common Parameters. */
	public static class ModIDs {
		/** MOD ID Strings */
		@SuppressWarnings("hiding")
		public static final String
		  MC                = "minecraft"
		
		, GT                = "gregtech"
		, GAPI              = "gregapi"
		, GAPI_POST         = "gregapi_post"
		
		, QT                = "qwertech"
		
		, WAILA             = "Waila"
		
		, IC2               = "IC2"
		, IC2C              = "IC2-Classic-Spmod"
		
		, NC                = "IC2NuclearControl"
		, IHL               = "ihl"
		
		, FMB               = "ForgeMicroblock"
		, TRANSLOCATOR      = "Translocator"
		, FUNK              = "funkylocomotion"
		, BAUBLES           = "Baubles"
		
		, TC                = "Thaumcraft"
		, TCTE              = "ThaumcraftExtras"//TODO Mod ID might be wrong!
		, TCFM              = "ForbiddenMagic"
		, TECHNOM           = "technom"
		, BOTA              = "Botania"
		, ALF               = "alfheim"
		, PE                = "ProjectE"
		, WTCH              = "witchery"
		, HOWL              = "howlingmoon"
		, TF                = "TwilightForest"
		, ERE               = "erebus"
		, ATUM              = "atum"
		, BTL               = "thebetweenlands"
		, AETHER            = "aether"
		, TROPIC            = "tropicraft"
		, MYST              = "Mystcraft"
		, WARPBOOK          = "warpbook"
		, ARS               = "arsmagica2"
		, CANDY             = "candycraftmod"
		, ABYSSAL           = "abyssalcraft"
		, SOULFOREST        = "soulforest"
		
		, RC                = "Railcraft"
		
		, IE                = "ImmersiveEngineering"
		
		, TE                = "ThermalExpansion"
		, TE_FOUNDATION     = "ThermalFoundation"
		, TE_DYNAMICS       = "ThermalDynamics"
		, TE_DRILLS         = "rfdrills"
		
		, AE                = "appliedenergistics2"
		, MO                = "mo"
		
		, TFC               = "terrafirmacraft"
		, TFCP              = "terrafirmacraftplus"
		
		, ZTONES            = "Ztones"
		, CHSL              = "chisel"
		
		, NePl              = "netheriteplus"
		, NeLi              = "netherlicious"
		, EnLi              = "enderlicious"
		, EtFu              = "etfuturum"
		, BB                = "betterbeginnings"
		, DYNAMIC_TREES     = "dynamictrees"
		
		, BbLC              = "BiblioCraft"
		, CARP              = "CarpentersBlocks"
		, BETTER_RECORDS    = "betterrecords"
		, ENCHIRIDION       = "Enchiridion"
		, ENCHIRIDION2      = "Enchiridion2"
		, LOSTBOOKS         = "LostBooks"
		, LOOTBAGS          = "lootbags"
		, EUREKA            = "eureka"
		, VN4               = "VillageNames"
		
		, UB                = "UndergroundBiomes"
		, COG               = "CustomOreGen"
		, PFAA              = "PFAAGeologica"
		, MIN               = "mineralogy"
		, RH                = "globbypotato_rockhounding"
		
		, FR                = "Forestry"
		, FRMB              = "MagicBees"
		, BINNIE            = "BinnieCore"
		, BINNIE_BEE        = "ExtraBees"
		, BINNIE_TREE       = "ExtraTrees"
		, BINNIE_GENETICS   = "Genetics"
		, BINNIE_BOTANY     = "Botany"
		, BINNIE_PATCHER    = "BinniePatcher"
		
		, MFR               = "MineFactoryReloaded"
		, PnC               = "PneumaticCraft"
		, FSP               = "Steamcraft"
		, SC2               = "steamcraft2"
		, ExU               = "ExtraUtilities"
		, ExS               = "ExtraSimple"
		, EIO               = "EnderIO"
		, RT                = "RandomThings"
		, AA                = "ActuallyAdditions"
		
		, SD                = "StorageDrawers"
		, BTRS              = "betterstorage"
		, JABBA             = "JABBA"
		
		, MgC               = "Magneticraft"
		, BR                = "BigReactors"
		, HBM               = "hbm"
		, ELN               = "Eln"
		
		, DRGN              = "DragonAPI"
		, RoC               = "RotaryCraft"
		, ReC               = "ReactorCraft"
		, ElC               = "ElectriCraft"
		, CrC               = "ChromatiCraft"
		
		, VOLTZ             = "voltzengine"
		, MFFS              = "mffs"
		, ICBM              = "icbmclassic"
		, ATSCI             = "atomicscience"
		
		, Mek               = "Mekanism"
		, Mek_Tools         = "MekanismTools"
		, Mek_Generators    = "MekanismGenerators"
		
		, OC                = "OpenComputers"
		, CC                = "ComputerCraft"
		
		, TreeCap           = "Treecapitator"
		, HaC               = "harvestcraft"
		, Salt              = "SaltMod"
		, CookBook          = "cookingbook"
		, APC               = "AppleCore"
		, HO                = "HungerOverhaul"
		, ENVM              = "enviromine"
		, MaCr              = "magicalcrops"
		, MaCu              = "Mariculture"
		, MoCr              = "MoCreatures"
		, WiMo              = "wildmobsmod"
		, Birb              = "exoticbirds"
		, ChocoCraft        = "chococraft"
		, GoG               = "GrimoireOfGaia"
		, DRPG              = "divinerpg"
		, PdC               = "psychedelicraft"
		, Bamboo            = "BambooMod"
		, PMP               = "plantmegapack"
		, Fossil            = "fossil"
		, GrC               = "Growthcraft"
		, GrC_Apples        = "Growthcraft|Apples"
		, GrC_Cellar        = "Growthcraft|Cellar"
		, GrC_Bamboo        = "Growthcraft|Bamboo"
		, GrC_Bees          = "Growthcraft|Bees"
		, GrC_Fish          = "Growthcraft|Fishtrap"
		, GrC_Grapes        = "Growthcraft|Grapes"
		, GrC_Hops          = "Growthcraft|Hops"
		, GrC_Milk          = "Growthcraft|Milk"
		, GrC_Rice          = "Growthcraft|Rice"
		
		, CrGu              = "craftguide"
		, SmAc              = "SimpleAchievements"
		, HQM               = "HardcoreQuesting"
		
		, HEX               = "hexcraft"
		, DE                = "DraconicEvolution"
		, AV                = "Avaritia"
		
		, EB                = "enhancedbiomes"
		, EBXL              = "ExtrabiomesXL"
		, BoP               = "BiomesOPlenty"
		, HiL               = "Highlands"
		
		, ATG               = "ATG"
		, RTG               = "RTG"
		, RWG               = "RWG"
		
		, A97               = "Aroma1997Core"
		, A97_MINING        = "Aroma1997sDimension"
		
		, CW2               = "caveworld"
		
		, GaSu              = "ganyssurface"
		, GaNe              = "ganysnether"
		, GaEn              = "ganysend"
		, WdSt              = "woodstuff"
		
		, HEE               = "HardcoreEnderExpansion"
		
		, LycM              = "lycanitesmobs"
		, LycM_Fresh        = "freshwatermobs"
		, LycM_Salt         = "saltwatermobs"
		, LycM_Swamp        = "swampmobs"
		, LycM_Plains       = "plainsmobs"
		, LycM_Forest       = "forestmobs"
		, LycM_Jungle       = "junglemobs"
		, LycM_Mountain     = "mountainmobs"
		, LycM_Desert       = "desertmobs"
		, LycM_Arctic       = "arcticmobs"
		, LycM_Inferno      = "infernomobs"
		, LycM_Demon        = "demonmobs"
		, LycM_Shadow       = "shadowmobs"
		
		, BC                = "BuildCraft|Core"
		, BC_SILICON        = "BuildCraft|Silicon"
		, BC_TRANSPORT      = "BuildCraft|Transport"
		, BC_FACTORY        = "BuildCraft|Factory"
		, BC_ENERGY         = "BuildCraft|Energy"
		, BC_BUILDERS       = "BuildCraft|Builders"
		, BC_ROBOTICS       = "BuildCraft|Robotics"
		
		, RP                = "Redpower"
		, BP                = "bluepower"
		, PR                = "ProjRed|Core"
		, PR_TRANSPORT      = "ProjRed|Transportation"
		, PR_INTEGRATION    = "ProjRed|Integration"
		, PR_EXPANSION      = "ProjRed|Expansion"
		, PR_TRANSMISSION   = "ProjRed|Transmission"
		, PR_EXPLORATION    = "ProjRed|Exploration"
		, PR_COMPATIBILITY  = "ProjRed|Compatibility"
		, PR_FABRICATION    = "ProjRed|Fabrication"
		, PR_ILLUMINATION   = "ProjRed|Illumination"
		
		, WR_CBE_C          = "WR-CBE|Core"
		, WR_CBE_A          = "WR-CBE|Addons"
		, WR_CBE_L          = "WR-CBE|Logic"
		
		, COFH_API          = "CoFHAPI"
		, COFH_API_ENERGY   = "CoFHAPI|energy"
		, COFH_CORE         = "CoFHCore"
		
		, OB                = "OpenBlocks"
		, PA                = "progressiveautomation"
		, MNTL              = "Mantle"
		, TiC               = "TConstruct"
		, Natura            = "Natura"
		, MF2               = "minefantasy2"
		, FZ                = "factorization"
		, BWM               = "weaponmod"
		, BG2               = "battlegear2"
		, OMT               = "openmodularturrets"
		, TG                = "Techguns"
		
		, WARPDRIVE         = "WarpDriveCore"
		, FM                = "meteors"
		, GC                = "GalacticraftCore"
		, GC_PLANETS        = "GalacticraftMars"
		, GC_GALAXYSPACE    = "GalaxySpace"
		, GC_ADV_ROCKETRY   = "advancedRocketry"
		, GC_EXTRAPLANETS   = "ExtraPlanets"
		, VULPES            = "libVulpes"
		, MD8               = "Micdoodlecore"
		;
	}

	
	public static final Map<String, String> TRANSFORMATION_POWDER_SPAWNER_MAP = new HashMap<>();
	
	static {
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Minotaur"          , "PigZombie"    );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Wild Deer"         , "Cow"          );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Bighorn Sheep"     , "Sheep"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Wild Boar"         , "Pig"          );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Forest Raven"      , "Bat"          );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Hostile Wolf"      , "Wolf"         );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Glacier Penguin"   , "Chicken"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Hedge Spider"      , "Spider"       );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Swarm Spider"      , "CaveSpider"   );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Twilight Wraith"   , "Blaze"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Redcap"            , "Zombie"       );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Skeleton Druid"    , "Witch"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Tower Termite"     , "Silverfish"   );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Redcap Sapper"     , "Creeper"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Mini Ghast"        , "Ghast"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Mist Wolf"         , "Enderman"     );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.King Spider"       , "Skeleton"     );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Slime Beetle"      , "Slime"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Fire Beetle"       , "LavaSlime"    );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Tower Golem"       , "VillagerGolem");
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Firefly"           , "Squid"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Redscale Broodling", "MushroomCow"  );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Pinch Beetle"      , "EntityHorse"  );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Forest Squirrel"   , "Ozelot"       );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("TwilightForest.Forest Bunny"      , "SnowMan"      );
		
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("PigZombie"    , "TwilightForest.Minotaur"          );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Cow"          , "TwilightForest.Wild Deer"         );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Sheep"        , "TwilightForest.Bighorn Sheep"     );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Pig"          , "TwilightForest.Wild Boar"         );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Bat"          , "TwilightForest.Forest Raven"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Wolf"         , "TwilightForest.Hostile Wolf"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Chicken"      , "TwilightForest.Glacier Penguin"   );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Spider"       , "TwilightForest.Hedge Spider"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("CaveSpider"   , "TwilightForest.Swarm Spider"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Blaze"        , "TwilightForest.Twilight Wraith"   );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Zombie"       , "TwilightForest.Redcap"            );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Witch"        , "TwilightForest.Skeleton Druid"    );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Silverfish"   , "TwilightForest.Tower Termite"     );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Creeper"      , "TwilightForest.Redcap Sapper"     );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Ghast"        , "TwilightForest.Mini Ghast"        );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Enderman"     , "TwilightForest.Mist Wolf"         );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Skeleton"     , "TwilightForest.King Spider"       );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Slime"        , "TwilightForest.Slime Beetle"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("LavaSlime"    , "TwilightForest.Fire Beetle"       );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("VillagerGolem", "TwilightForest.Tower Golem"       );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Squid"        , "TwilightForest.Firefly"           );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("MushroomCow"  , "TwilightForest.Redscale Broodling");
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("EntityHorse"  , "TwilightForest.Pinch Beetle"      );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("Ozelot"       , "TwilightForest.Forest Squirrel"   );
		TRANSFORMATION_POWDER_SPAWNER_MAP.put("SnowMan"      , "TwilightForest.Forest Bunny"      );
	}

}
