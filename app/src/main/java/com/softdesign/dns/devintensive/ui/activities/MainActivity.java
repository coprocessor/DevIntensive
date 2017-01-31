package com.softdesign.dns.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softdesign.dns.devintensive.R;
import com.softdesign.dns.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";
    private static final String TAG = ConstantManager.TAG_PREFIX + " " + MainActivity.class.getSimpleName(); ///
    protected EditText mEtHelloWorld; ///
    protected Button mBtnVisible, mBtnInVisible; ///
    private String mVisibleMode; ///
    private int mColorMode; ///
    private int mActivityCount = 0; ///

    /**
     * Метод вызывается при создании активности (после изменения конфигурации/ возврата к текущей
     * активности после его уничтожения.
     *
     * В данном методе инициализируется/производится:
     * -UI пользовательский интерфейс (статика)
     * -инициализация статических данных активности (activity)
     * -связь данных со списками (инициализация адаптеров)
     *
     * Внимание: Не запускать длительные операции по работе с данными в onCreate() !
     *
     * @param savedInstanceState -- объект со значениями сохраненными в Bundle -- состояния UI.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        if (savedInstanceState == null) {
            // 'активность' запускается впервые
        } else {
            // 'активность' уже создавалась
        }
    }

    /**
     * Метод вызывается при старте 'активности', за момент до того, как UI станет доступен
     * пользователю. Как правило, в данном методе происходит регистрация подписки на события
     * остановка которых была произведена в onStop().
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * Метод вызывается, когда 'активность' становится доступной пользователю для взаимодействия.
     * В данном методе, как правило, происходит запуск анимаций, аудио/видео, запускается
     * BroadCastReceiver -- необходимых для реализации UI-логики (запуск выполнения потока и т. п.).
     * Метод должен быть максимально "легковесным" -- для увеличения производительности (адекватной
     * отзывчивости) UI.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * Метод вызывается, когда текущая 'активность' теряет фокус, но остается видимой пользователю
     * (всплытие диалогового окна, частичное перекрытие иной 'активностью' и т. д.
     * <p/>
     * В данном методе реализуют сохранение "легковесных" UI -данных/-анимаций/-аудио/видео и т. д.)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * Метод вызывается, когда 'активность' становится невидимой пользователю. В данном методе
     * происходит отписка от событий, остановка "тяжелых" анимаций, сложных операций по сохранению
     * данных, прерывание запущенных потоков и т. д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * Метод вызывается по окончанию работы 'активности' -- когда это происходит системно или
     * после вызова метода finish().
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * Метод вызывается при рестарте 'активности' -- возобновление работы после вызова метода
     * onStop(). В данном методе реализуется специфическая бизнес-логика, которая должна быть
     * реализована, именно, при рестарте 'активности'. Например: запрос к серверу, который необходимо
     * вызывать по возвращении из другой 'активности' (обновления данных, подписка на определенное
     * событие проинициализированное на другом экране  (специфическая бизнес-логика "завязанная", именно
     * на перезапуске 'активности').
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
