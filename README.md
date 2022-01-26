# VerticalSeekbar


### Types

1. Normal

https://user-images.githubusercontent.com/19689773/151178332-3fbb1b22-1afb-4b41-b88e-8d500ed138b0.mp4

```
    <com.github.chanjungkim.verticalseekbar.VerticalSeekBarWrapper
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent">

        <com.github.chanjungkim.verticalseekbar.VerticalSeekBar
            android:id="@+id/vertical_seek_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:max="100"
            android:min="0"
            android:paddingRight="10dp"
            android:progressTint="@color/black"
            android:thumb="@drawable/ic_baseline_accessibility_new_24"
            app:seekBarRotation="CW270"
            app:stickyValue="-1"
            app:triggerValue="40" />
    </com.github.chanjungkim.verticalseekbar.VerticalSeekBarWrapper>

```

2. Sticky

https://user-images.githubusercontent.com/19689773/151178314-92b3eaaf-866e-4780-bb6b-12f4cadbeaf6.mp4

```
    <com.github.chanjungkim.verticalseekbar.VerticalSeekBarWrapper
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent">

        <com.github.chanjungkim.verticalseekbar.VerticalSeekBar
            android:id="@+id/vertical_seek_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:max="100"
            android:min="0"
            android:paddingRight="10dp"
            android:progressTint="@color/black"
            android:thumb="@drawable/ic_baseline_accessibility_new_24"
            app:seekBarRotation="CW270"
            app:stickyValue="30"
            app:triggerValue="60" />
    </com.github.chanjungkim.verticalseekbar.VerticalSeekBarWrapper>
```

### Event Handling

```
        verticalView.apply {
            // VerticalSeekbar Event
            setSlideButtonListener(object : VerticalSeekBar.SlideButtonListener {
                override fun handleSlide() {
                    Toast.makeText(this@MainActivity, "triggered!", Toast.LENGTH_SHORT).show()
                }
            })
            
            // General Seekbar Event
            setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean,
                ) {
                    textView.text = "$progress"
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                    // nothing
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                    // nothing
                }

            })
        }
```
