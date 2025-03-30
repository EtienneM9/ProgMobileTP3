package com.example.persistence.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.persistence.entities.DailyPlanning;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PlanningDao_Impl implements PlanningDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DailyPlanning> __insertionAdapterOfDailyPlanning;

  public PlanningDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDailyPlanning = new EntityInsertionAdapter<DailyPlanning>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `daily_planning` (`id`,`userId`,`date`,`slot1Activity`,`slot2Activity`,`slot3Activity`,`slot4Activity`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final DailyPlanning entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getUserId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUserId());
        }
        statement.bindLong(3, entity.getDate());
        if (entity.getSlot1Activity() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getSlot1Activity());
        }
        if (entity.getSlot2Activity() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSlot2Activity());
        }
        if (entity.getSlot3Activity() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSlot3Activity());
        }
        if (entity.getSlot4Activity() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getSlot4Activity());
        }
      }
    };
  }

  @Override
  public Object insertPlanning(final DailyPlanning planning,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDailyPlanning.insert(planning);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<DailyPlanning>> getPlanningForUser(final String userId) {
    final String _sql = "SELECT * FROM daily_planning WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"daily_planning"}, new Callable<List<DailyPlanning>>() {
      @Override
      @NonNull
      public List<DailyPlanning> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfSlot1Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot1Activity");
          final int _cursorIndexOfSlot2Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot2Activity");
          final int _cursorIndexOfSlot3Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot3Activity");
          final int _cursorIndexOfSlot4Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot4Activity");
          final List<DailyPlanning> _result = new ArrayList<DailyPlanning>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final DailyPlanning _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final String _tmpSlot1Activity;
            if (_cursor.isNull(_cursorIndexOfSlot1Activity)) {
              _tmpSlot1Activity = null;
            } else {
              _tmpSlot1Activity = _cursor.getString(_cursorIndexOfSlot1Activity);
            }
            final String _tmpSlot2Activity;
            if (_cursor.isNull(_cursorIndexOfSlot2Activity)) {
              _tmpSlot2Activity = null;
            } else {
              _tmpSlot2Activity = _cursor.getString(_cursorIndexOfSlot2Activity);
            }
            final String _tmpSlot3Activity;
            if (_cursor.isNull(_cursorIndexOfSlot3Activity)) {
              _tmpSlot3Activity = null;
            } else {
              _tmpSlot3Activity = _cursor.getString(_cursorIndexOfSlot3Activity);
            }
            final String _tmpSlot4Activity;
            if (_cursor.isNull(_cursorIndexOfSlot4Activity)) {
              _tmpSlot4Activity = null;
            } else {
              _tmpSlot4Activity = _cursor.getString(_cursorIndexOfSlot4Activity);
            }
            _item = new DailyPlanning(_tmpId,_tmpUserId,_tmpDate,_tmpSlot1Activity,_tmpSlot2Activity,_tmpSlot3Activity,_tmpSlot4Activity);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getTodayPlanningForUser(final String userId, final long date,
      final Continuation<? super DailyPlanning> $completion) {
    final String _sql = "SELECT * FROM daily_planning WHERE userId = ? AND date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, date);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<DailyPlanning>() {
      @Override
      @NonNull
      public DailyPlanning call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfSlot1Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot1Activity");
          final int _cursorIndexOfSlot2Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot2Activity");
          final int _cursorIndexOfSlot3Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot3Activity");
          final int _cursorIndexOfSlot4Activity = CursorUtil.getColumnIndexOrThrow(_cursor, "slot4Activity");
          final DailyPlanning _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final String _tmpSlot1Activity;
            if (_cursor.isNull(_cursorIndexOfSlot1Activity)) {
              _tmpSlot1Activity = null;
            } else {
              _tmpSlot1Activity = _cursor.getString(_cursorIndexOfSlot1Activity);
            }
            final String _tmpSlot2Activity;
            if (_cursor.isNull(_cursorIndexOfSlot2Activity)) {
              _tmpSlot2Activity = null;
            } else {
              _tmpSlot2Activity = _cursor.getString(_cursorIndexOfSlot2Activity);
            }
            final String _tmpSlot3Activity;
            if (_cursor.isNull(_cursorIndexOfSlot3Activity)) {
              _tmpSlot3Activity = null;
            } else {
              _tmpSlot3Activity = _cursor.getString(_cursorIndexOfSlot3Activity);
            }
            final String _tmpSlot4Activity;
            if (_cursor.isNull(_cursorIndexOfSlot4Activity)) {
              _tmpSlot4Activity = null;
            } else {
              _tmpSlot4Activity = _cursor.getString(_cursorIndexOfSlot4Activity);
            }
            _result = new DailyPlanning(_tmpId,_tmpUserId,_tmpDate,_tmpSlot1Activity,_tmpSlot2Activity,_tmpSlot3Activity,_tmpSlot4Activity);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object checkPlanningExists(final String userId, final long date,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM daily_planning WHERE userId = ? AND date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, date);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
