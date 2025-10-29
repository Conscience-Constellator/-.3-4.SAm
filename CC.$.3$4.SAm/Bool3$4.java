package CC.$.Q3$4;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Bool3$4
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Bool3$4(boolean A,boolean B,boolean C,
		boolean[] Out);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean[] Bool3$4(boolean A,boolean B,boolean C)
		{
			boolean[] Out=new boolean[4];

			Bool3$4(A,B,C,Out);

			return Out;
		}
}