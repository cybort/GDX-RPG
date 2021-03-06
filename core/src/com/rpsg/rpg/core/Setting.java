package com.rpsg.rpg.core;

import com.badlogic.gdx.scenes.scene2d.utils.NinePatchDrawable;
import com.rpsg.rpg.object.base.Persistence;
import com.rpsg.rpg.utils.game.GameUtil;

public class Setting {
	public static final String GAME_VERSION = "Build 448 20150805";
	public static final String GDXRPG_VERSION = "Alpha 43";
	// 资源路径
	public static final String BASE_PATH = "";
	public static final String IMAGE_BASE_PATH = "images";

	public static final String IMAGE_BACKGROUND = BASE_PATH + IMAGE_BASE_PATH + "/background/";
	public static final String IMAGE_LOGO = BASE_PATH + IMAGE_BASE_PATH + "/logo/";
	public static final String IMAGE_LOAD = BASE_PATH + IMAGE_BASE_PATH + "/load/";
	public static final String IMAGE_TITLE = BASE_PATH + IMAGE_BASE_PATH + "/title/";
	public static final String IMAGE_FG = BASE_PATH + IMAGE_BASE_PATH + "/fg/";
	public static final String IMAGE_ANIMATION = BASE_PATH + IMAGE_BASE_PATH + "/animation/";

	public static final String MUSIC_BGM = BASE_PATH + "sound/bgm/";
	public static final String MUSIC_SE = BASE_PATH + "sound/se/";
	public static final String MAP = BASE_PATH + "maps/";

	public static final String IMAGE_MENU = BASE_PATH + IMAGE_BASE_PATH + "/menu/";
	public static final String IMAGE_CG = BASE_PATH + IMAGE_BASE_PATH + "/cg/";
	public static final String IMAGE_ENEMY = BASE_PATH + IMAGE_BASE_PATH + "/enemy/";
	public static final String IMAGE_BATTLE = BASE_PATH + IMAGE_BASE_PATH + "/battle/";

	// Menu images/menu/
	public static final String IMAGE_MENU_GLOBAL = IMAGE_MENU + "nglobal/";
	public static final String IMAGE_MENU_MAP = IMAGE_MENU + "map/";
	public static final String IMAGE_MENU_EQUIP = IMAGE_MENU + "nequip/";
	public static final String IMAGE_MENU_SC = IMAGE_MENU + "sc/";
	public static final String IMAGE_MENU_ITEM = IMAGE_MENU + "nitem/";
	public static final String IMAGE_MENU_STATUS = IMAGE_MENU + "nstatus/";
	public static final String IMAGE_MENU_SYSTEM = IMAGE_MENU + "nsystem/";
	public static final String IMAGE_MENU_TACTIC = IMAGE_MENU + "tactic/";

	public static final String MESSAGE = BASE_PATH + IMAGE_BASE_PATH + "/message/";
	public static final String WALK = BASE_PATH + IMAGE_BASE_PATH + "/walk/";
	public static final String SHADER = BASE_PATH + "shader/";
	public static final String IMAGE_GLOBAL = BASE_PATH + IMAGE_BASE_PATH + "/global/";
	public static final String IMAGE_ICONS = BASE_PATH + IMAGE_BASE_PATH + "/icons/";
	public static final String PARTICLE = BASE_PATH + "particle/";
	
	//script
	public static final String SCRIPT = BASE_PATH + "script";
	public static final String SCRIPT_MAP = SCRIPT + "/map/";
	public static final String SCRIPT_DATA = SCRIPT +"/data/";
	public static final String SCRIPT_DATA_ITEM = SCRIPT_DATA + "/item/";
	public static final String SCRIPT_DATA_ENEMY = SCRIPT_DATA + "/enemy/";
	public static final String SCRIPT_DATA_ASSOCIATION = SCRIPT_DATA + "/association/";
	public static final String SCRIPT_DATA_ASSOCIATION_SKILL = SCRIPT_DATA_ASSOCIATION + "skill/";
	public static final String SCRIPT_DATA_HERO = SCRIPT_DATA + "/hero/";
	public static final String SCRIPT_DATA_BUFF = SCRIPT_DATA + "/buff/";
	public static final String SCRIPT_SYSTEM = SCRIPT + "/system/";

	// 存档最大页数
	public static final int SAVE_FILE_MAX_PAGE = 20;

	// 高级个性化系统设置存储
	public static final String PERSISTENCE = "save/";
	public static Persistence persistence;

	// 文本间距
	public static final int STRING_PADDING_TB = 3;
	public static final int STRING_PADDING_LR = 1;

	// 系统菜单文字显示速度默认显示文字
	public static final String MENU_SYSTEM_TEST_MESSAGE = "人类为何要互相伤害呢？";

	// UI
	public static NinePatchDrawable UI_BUTTON;
	public static NinePatchDrawable UI_TOAST;
	public static String UI_BASE_IMG = IMAGE_MENU_GLOBAL + "white.jpg";
	public static String UI_GRAY_IMG = IMAGE_MENU_GLOBAL + "drawable_gray_opacity.png";
	public static String UI_BASE_PRO = IMAGE_MENU_GLOBAL + "progressbar.png";

	public static void init() {
		UI_BUTTON = new NinePatchDrawable(GameUtil.processNinePatchFile(IMAGE_MENU_GLOBAL + "button_p.png"));
		UI_TOAST = new NinePatchDrawable(GameUtil.processNinePatchFile(IMAGE_MENU_GLOBAL + "toast_box.png",2,2,1,1,5,5,5,5));
	}

	public static final String RPGOBJECT_SHADOW = WALK + "walk_shadow.png";
	
	//RPSG服务器
	public static final String NET_LOGIN_URL = "http://rpsgvote.sinaapp.com/lyric.php";
}