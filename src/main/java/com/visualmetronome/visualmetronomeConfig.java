package com.visualmetronome;

import net.runelite.client.config.*;

import java.awt.Color;

@ConfigGroup("visualmetronome")
public interface visualmetronomeConfig extends Config
{
	@Alpha
	@ConfigItem(
			position = 1,
			keyName = "tickColor",
			name = "Tick Color",
			description = "Configures the color of tick"
	)
	default Color getTickColor()
	{
		return Color.WHITE;
	}

	@Alpha
	@ConfigItem(
			position = 2,
			keyName = "tockColor",
			name = "Tock Color",
			description = "Configures the color of tock"
	)
	default Color getTockColor()
	{
		return Color.GRAY;
	}

	@Range(
			min = 1
	)
	@ConfigItem(
			position = 3,
			keyName = "tickCount",
			name = "Tick Count",
			description = "The tick on which the color changes (Only supports two colors)"
	)
	default int tickCount()
	{
		return 1;
	}

	@ConfigItem(
			position = 6,
			keyName = "showTitle",
			name = "Show title",
			description = "Toggle display of the title on overlay"
	)
	default boolean showTitle()
	{
		return false;
	}

	@ConfigSection(
			name = "Additional Color Settings",
			description = "Change the colors and number of colors to cycle through",
			position = 7
	)
	String ColorSettings = "Additional Color Settings";

	@Range(
			min = 2,
			max = 10
	)
	@ConfigItem(
			position = 7,
			keyName = "colorCycle",
			name = "Number of Colors",
			description = "The number of colors it cycles through",
			section = ColorSettings
	)
	default int colorCycle()
	{
		return 2;
	}

	@Alpha
	@ConfigItem(
			position = 8,
			keyName = "tick3Color",
			name = "3rd Tick Color",
			description = "Configures the color of 3rd tick if enabled",
			section = ColorSettings
	)
	default Color getTick3Color()
	{
		return Color.DARK_GRAY;
	}
	@Alpha
	@ConfigItem(
			position = 9,
			keyName = "tick4Color",
			name = "4th Tick Color",
			description = "Configures the color of the 4th tick if enabled",
			section = ColorSettings
	)
	default Color getTick4Color()
	{
		return Color.BLACK;
	}
	@Alpha
	@ConfigItem(
			position = 10,
			keyName = "tick5Color",
			name = "5th Tick Color",
			description = "Configures the color of the 5th tick if enabled",
			section = ColorSettings
	)
	default Color getTick5Color()
	{
		return new Color(112, 131, 255);
	}
	@Alpha
	@ConfigItem(
			position = 11,
			keyName = "tick6Color",
			name = "6th Tick Color",
			description = "Configures the color of the 6th tick if enabled",
			section = ColorSettings
	)
	default Color getTick6Color()
	{
		return new Color(0, 23, 171);
	}
	@Alpha
	@ConfigItem(
			position = 12,
			keyName = "tick7Color",
			name = "7th Tick Color",
			description = "Configures the color of the 7th tick if enabled",
			section = ColorSettings
	)
	default Color getTick7Color()
	{
		return new Color(107, 255, 124);
	}
	@Alpha
	@ConfigItem(
			position = 13,
			keyName = "tick8Color",
			name = "8th Tick Color",
			description = "Configures the color of the 8th tick if enabled",
			section = ColorSettings
	)
	default Color getTick8Color()
	{
		return new Color(0, 191, 22);
	}
	@Alpha
	@ConfigItem(
			position = 14,
			keyName = "tick9Color",
			name = "9th Tick Color",
			description = "Configures the color of the 9th tick if enabled",
			section = ColorSettings
	)
	default Color getTick9Color()
	{
		return new Color(255, 105, 94);
	}
	@Alpha
	@ConfigItem(
			position = 15,
			keyName = "tick10Color",
			name = "10th Tick Color",
			description = "Configures the color of the 10th tick if enabled",
			section = ColorSettings
	)
	default Color getTick10Color()
	{
		return new Color(255, 17, 0);
	}

}

