package com.geektech.homework3_6
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.homework3_6.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {
    private lateinit var binding:FragmentFirstBinding
    private var songList = arrayListOf<Song>()
    private var bundle = Bundle()
    private var fragment:SecondFragment = SecondFragment()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = com.geektech.homework3_6.databinding.FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        songList.clear()
        loadData()

        val musicAdapter = MusicAdapter(songList, this::onClick)
        arrayOf(binding.rvMusicList) = musicAdapter
    }

    fun onClick(position:Int){

        bundle.putSerializable("key", songList[position])
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).addToBackStack(null).commit()

    }

    private fun loadData(){
        songList.add(Song("Ice cream Man", "Tyga","3:06","https://i1.sndcdn.com/artworks-000127352052-suh1ra-t500x500.jpg"))
        songList.add(Song("Money Trees", "Kendrick Lamar, Jay Rock","6:26","http://img.wynk.in/unsafe/320x180/top/http://s3-ap-southeast-1.amazonaws.com/bsbcms/srch_universalmusic/music/srch_universalmusic_00602537362714-USUM71211185.jpg"))
        songList.add(Song("4:00A.M.", "Taeko Onuki","5:36","https://lastfm.freetls.fastly.net/i/u/avatar170s/7b0caf482bf63dfa696d6e7a684c4378"))
        songList.add(Song("BOHEMIAN", "Taeko Onuki", "4:09", "https://lastfm.freetls.fastly.net/i/u/avatar170s/7b0caf482bf63dfa696d6e7a684c4378"))
        songList.add(Song("Messages from the Stars", "The Rah Band", "4:14","https://www.pngall.com/wp-content/uploads/2016/07/Anime-PNG-Pic.png"))
        songList.add(Song("Just the Two of Us", "Grover Washington, Jr.", "7:23", "https://images.wolfgangsvault.com/m/large/ZZZ041831-VL/grover-washington-jr-vinyl-12-1977.webp"))
        songList.add(Song("Stayin' Alive", "Bee Gees", "1:32", "https://w7.pngwing.com/pngs/185/683/png-transparent-t-shirt-bee-gees-stayin-alive-drawing-bee-text-poster-logo.png"))
        songList.add(Song("Jealous", "Eyedress", "2:32", "https://images.genius.com/605a768e45889d3bd7cbaebd43edcd03.700x700x1.png"))
        songList.add(Song("Bang Bang", "K'NAAN, Adam Levine", "3:06", "https://i.scdn.co/image/ab67616d0000b27378345fea6867c785b03e0141"))
        songList.add(Song("Notion", "The Rare Occasions", "3:15", "https://i.scdn.co/image/ab67616d0000b273598721fc8c9dde3f65a73a08"))
        songList.add(Song("Godzilla", "Eminem, Juice WRLD", "3:30", "https://i1.sndcdn.com/artworks-000675219829-3jglm5-t500x500.jpg"))
        songList.add(Song("Mockingbird", "Eminem", "4:10", "https://i.scdn.co/image/ab67616d0000b273726d48d93d02e1271774f023"))
        songList.add(Song("Without Me", "Eminem", "4:50", "https://i.scdn.co/image/ab67616d0000b2736ca5c90113b30c3c43ffb8f4"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
        songList.add(Song("The Real Slim Shady", "Eminem", "4:44", "https://upload.wikimedia.org/wikipedia/ru/9/97/The_Real_Slim_Shady_cover.jpg"))
    }
}