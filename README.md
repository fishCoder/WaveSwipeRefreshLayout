# WaveSwipeRefreshLayout

'''
	<com.maimengmami.waveswiperefreshlayout.WaveSwipeRefreshLayout
        android:id="@+id/wave_layout"
        android:layout_width="match_parent"
        app:above_wave_color="@color/material_deep_teal_200"
        app:blow_wave_color="@color/material_deep_teal_500"
        android:layout_height="match_parent">

        <android.support.v7.widget.RecyclerView
            android:id="@+id/recyclerview"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            />

    </com.maimengmami.waveswiperefreshlayout.WaveSwipeRefreshLayout>
    '''


'''
waveSwipeRefreshLayout.setOnRefreshListener(new WaveSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                waveSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onLoad() {
               waveSwipeRefreshLayout.setLoading(false);
            }

            @Override
            public boolean canLoadMore() {
                return true;
            }

            @Override
            public boolean canRefresh() {
                return true;
            }


    });
        '''


### License

WaveSwipeRefreshLayout is available under the [MIT](http://opensource.org/licenses/MIT) licence.

```
The MIT License (MIT)

Copyright (c) 2015 fulongbin

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```