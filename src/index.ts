import { registerPlugin } from '@capacitor/core';

import type { ContextMenuPlugin } from './definitions';

const ContextMenu = registerPlugin<ContextMenuPlugin>('ContextMenu', {
  web: () => import('./web').then(m => new m.ContextMenuWeb()),
});

export * from './definitions';
export { ContextMenu };
