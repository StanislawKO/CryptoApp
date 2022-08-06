package com.codexample.cryptoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.codexample.cryptoapp.adapters.CoinInfoAdapter
import com.codexample.cryptoapp.pojo.CoinPriceInfo
import kotlinx.android.synthetic.main.activity_coin_price_list.*

class CoinPriceListActivity : AppCompatActivity() {

    //    private val compositeDisposable = CompositeDisposable()
    private lateinit var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        val adapter = CoinInfoAdapter(this)
        adapter.onCoinClickListener = object : CoinInfoAdapter.OnCoinClickListener {
            override fun onCoinClick(coinPriceInfo: CoinPriceInfo) {
                val intent = CoinDetailActivity.newIntent(
                    this@CoinPriceListActivity,
                    coinPriceInfo.fromSymbol
                )
                startActivity(intent)
//                Log.d("ON_CLICK_TEST", coinPriceInfo.fromSymbol)
            }

        }
        rvCoinPriceList.adapter = adapter
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.priceList.observe(this, Observer {
            adapter.coinInfoList = it
//            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
        })
//        viewModel.getDetailInfo("BTC").observe(this, Observer {
//            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
//        })
//        val disposable = ApiFactory.apiService.getFullPriceList(fSyms = "BTC, ETH, EOS")
//            .subscribeOn(Schedulers.io())
//            .subscribe({
//                       Log.d("TEST_OF_LOADING_DATA", it.toString())
//            }, {
//                Log.d("TEST_OF_LOADING_DATA", it.message.toString())
//            })
//        compositeDisposable.add(disposable)
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        compositeDisposable.dispose()
//    }
}