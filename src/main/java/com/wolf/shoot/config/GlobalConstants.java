package com.wolf.shoot.config;

/**
 * @author b053-mac
 * 全局变量
 */
public class GlobalConstants {

    /**
     *默认变量
     */
    public static class Constants{
        public static final int session_prcoss_message_max_size = 10;
        public static final int life_cycle_interval = 6000;
    }

    /**
     *心跳
     */
    public static class HeartBeart{
        public static final int cycle_time = 50;
        /**误差大小*/
        public static final int cycle_diff_time = 150;
    }

    /**
     *异步线程
     */
    public static class Damond{
        public static final int cycle_time = 500;
        /**误差大小*/
        public static final int cycle_diff_time = 500;
        /**清理欲分配房间*/
        public static final int clear_pre_room_cycle_time = 30000;

        public static final int pvp_match_cycle_time = 1000;
    }


    /**
     *队列线程执行大小
     */
    public static class QueueMessageExecutor{
        public static final boolean processLeft = true;
//		public static final int thread_size = 10;
    }


//	/**
//	 *队列线程执行大小
//	 */
//	public static class UpdateService{
//		public static final long update_time = 500;
//		public static final long time = 1;
//	}


    /**
     * 地图移动
     *
     */
    public static class MapMove{
        /**移动的最小广播距离*/
        public static int MINI_MOVE_INTERVAL_TIME = 1000;
    }

    /**
     * redis Key的基本配置
     */
    public static class RedisKeyConfig{
        /**正常缓存有效时间*/
        public static final int NORMAL_LIFECYCLE=86400;
        //mget时，key的最大值
        public static final int MGET_MAX_KEY=50;
        /**正常缓存有效时间一个月*/
        public static final int NORMAL_MONTH_LIFECYCLE=86400 * 24;
    }

    /**
     * redis Key的基本配置
     */
    public static class ConfigFile{
        /**game server*/
        public static final String GAME_SERVER_CONIFG="game_server.cfg.js";
        /**game server*/
        public static final String GAME_SERVER_DIFF_CONIFG="game_server_diff.cfg.js";
        /**pool*/
        public static final String REDIS_POOL_CONIFG="redis-pool-config.xml";
        /**redis*/
        public static final String REDIS="redis.xml";
        /**db*/
        public static final String DB_CONFIG="db.xml";
        /**gamemap*/
        public static final String GAMEMAP_CONFIG="gamemap-config.xml";
        /**rpc*/
        public static final String RPC_SERVER_CONFIG="rpc-server.xml";
    }

    /**
     * Thread的名字前缀
     */
    public static class Thread{
        public static final String GAME_DB_EXCUTE="game_db";
        public static final String GAME_DB_SYN_EXCUTE="game_db_syn";
        public static final String GAME_DB_SYN_UNCHAR_EXCUTE="game_db_syn_unchar_excute";
        public static final String GAME_MESSAGE_QUEUE_EXCUTE="game_message_queue";
        public static final String GAME_ASYNC="game_async";
        public static final String UPDATE="update";
        public static final String HEART_BEAT="heart_beat";
        public static final String WRITE_ONLINE_ROOM_SESSION="write_online_room_session";
        public static final String READ_ONLINE_MESSAGE_QUEUE="read_online_message_queue";
        public static final String CLEAR_PRE_ROOM="clear_pre_room";
        public static final String ROOM_UPDATE="room_date";
        public static final String CLIENT_SESSION_UPDATE_PRODUCE="client_session_update_produce";
        public static final String CLIENT_SESSION_UPDATE_CONSUME="client_session_update_consume";
        public static final String ROOM_UPDATE_PRODUCE="room_update_produce";
        public static final String ROOM_UPDATE_CONSUME="room_update_consume";
        public static final String GLOBAL_UPDATE_PRODUCE="global_update_produce";
        public static final String GLOBAL_UPDATE_CONSUME="global_update_consume";
        public static final String READ_A5_CHAT_MESSAGE_QUEUE="read_a5_chat_message_queue";
        public static final String PVP_PLAYER_MATCH="pvp_player_match";
        public static final String PVP_TEAM_MATCH="pvp_team_match";
    }

    /**
     * 网络
     */
    public static class Net{

        /** 心跳间隔*/
        public static final int HEART_BASE_SIZE= 1;
//		/** 心跳间隔*/
//		public static final int HEART_INTERVAL= HEART_BASE_SIZE;
//		/** 心跳超时*/
//		public static final int HEART_TIMEOUT= HEART_BASE_SIZE;
        /** 心跳超时*/
        public static final int SESSION_HEART_TIMEOUT= HEART_BASE_SIZE;

        /** 心跳保持协议检查 */
        public static final String SESSION_KEEEP_ALIVE_KEY = "heart";
        /** 心跳保持协议检查 */
        public static final int SESSION_KEEEP_ALIVE_TIME = HEART_BASE_SIZE * 1000;
    }

}